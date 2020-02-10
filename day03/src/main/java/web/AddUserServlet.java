package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.UserDao;
import entity.User;




public class AddUserServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		request.setCharacterEncoding("utf-8");
		
		//ͨ����������ȡ�������ύ�Ĳ���
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		System.out.println(username + " " + pwd + " " + email);
		
		response.setContentType("text/html;charset = utf-8");
		PrintWriter out = response.getWriter();
		
		try {
			UserDao dao = new UserDao();
			User user = new User();
			
			user.setUsername(username);
			user.setPwd(pwd);
			user.setEmail(email);
			dao.save(user);
			
			response.sendRedirect("list");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			out.println("ϵͳ��æ�����Ժ����ԣ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}