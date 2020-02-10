package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListUserServlet  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException{
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset = utf-8");
		PrintWriter out = response.getWriter();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtils.getConn();
			String sql = "select * from t_user";
			
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			out.println("<table border = '1' width = '60%' cellpadding = '0' cellspacing = '0'>");
			out.println("<tr><td>ID</td><td>用户名</td><td>密码</td><td>邮箱</td></tr>");
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				
				out.println("<tr>"
						+ "<td>" + id + "</td>"
						+ "<td>" + username + "</td>"
						+ "<td>" + pwd + "</td>"
						+ "<td>" + email + "</td>"
						+ "</tr>");
				
				
				
			}
			out.println("</table>");
			out.println("<p><a href = 'addUserServlet.html'>添加用户</a></p>");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			out.print("系统繁忙，请稍后再试");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, ps, conn);
		}
	}

}
