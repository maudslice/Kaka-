package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.UserDao;
import entity.User;




public class AddUserServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		
		//通过请求对象获取表单中提交的参数
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		System.out.println(username + " " + pwd + " " + email);
		
		response.setContentType("text/html;charset = utf-8");
		PrintWriter out = response.getWriter();
		
		
		UserDao dao = new UserDao();
		User user = null;
		try {
			
			user = dao.find(username);
			if (user != null) {
				request.setAttribute("addUser_fail", "该用户已存在，重新输入");
				request.getRequestDispatcher("addUser.jsp").forward(request, response);
			}else {
				user = new User();
				user.setUsername(username);
				user.setPwd(pwd);
				user.setEmail(email);
				dao.save(user);
			
				response.sendRedirect("list");
			}
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("error", "系统繁忙，请稍后再试");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("error", "系统繁忙，请稍后再试");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}

	}

}
