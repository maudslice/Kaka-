package web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import entity.User;



public class ListUserServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			UserDao dao = new UserDao();
			List<User>users = dao.findAll();
//			绑定转发对象
			request.setAttribute("users", users);
//			获得转发器
			RequestDispatcher rd = request.getRequestDispatcher("listUsers5.jsp");
//			调用转发器的方法转发
			rd.forward(request, response);
		} catch (SQLException e) {
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
