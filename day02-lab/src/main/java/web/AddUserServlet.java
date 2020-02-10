package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;




public class AddUserServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		System.out.println(username + " " + pwd + " " + email);
		
		response.setContentType("text/html;charset = utf-8");
		PrintWriter out = response.getWriter();
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn =DBUtils.getConn();
			String sql = "INSERT INTO t_user VALUES(null,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, pwd);
			ps.setString(3, email);
			ps.executeUpdate();
			
			response.sendRedirect("list");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			out.println("系统繁忙，请稍后再试！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(null, ps, conn);
		}

	}

}
