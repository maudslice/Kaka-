package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;

public class DelUserServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		System.out.println("sessionId:" + session.getId());
		Object obj = session.getAttribute("user");
		if (obj == null) {
			response.sendRedirect("login.jsp");
			return;
		}
		
		String id = request.getParameter("id");
		
		
		try {
			UserDao dao = new UserDao();
			dao.del(Integer.parseInt(id));
			
			response.sendRedirect("list");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("error", "系统繁忙，请稍后再试");
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
	}
}
