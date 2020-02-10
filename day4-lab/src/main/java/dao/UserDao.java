package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.User;
import web.DBUtils;

public class UserDao {

	
	public User find(String uname) throws Exception {
		User user = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtils.getConn();
			String sql = "select * from t_user where username=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1,uname);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(uname);
				user.setPwd(rs.getString("password"));
				user.setEmail(rs.getString("email"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}finally {
			DBUtils.close(rs, ps, conn);
		}
		return user;
	}
	
	
	public List<User> findAll() throws Exception {
		List<User> users = new ArrayList<User>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = DBUtils.getConn();
			String sql = "select * from t_user";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String pwd = rs.getString("password");
				String email = rs.getString("email");

				User user = new User(id, username, pwd, email);
				users.add(user);
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		} finally {
			DBUtils.close(rs, ps, conn);
		}
		return users;
	}

	public void save(User user) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = DBUtils.getConn();
			String sql = "INSERT INTO t_user VALUES(null,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPwd());
			ps.setString(3, user.getEmail());
			ps.executeUpdate();

			System.out.println("插入成功！");

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} finally {
			DBUtils.close(null, ps, conn);
		}
	}
	
	public void del(int id) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBUtils.getConn();
			String sql = "delete from t_user where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			ps.executeUpdate();
			
			System.out.println("删除成功！");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}finally {
			DBUtils.close(null, ps, conn);
		}
	}
}
