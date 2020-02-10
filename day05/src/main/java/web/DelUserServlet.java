package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

public class DelUserServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		
		
		try {
			UserDao dao = new UserDao();
			dao.del(Integer.parseInt(id));
			
			response.sendRedirect("list");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			out.print("系统繁忙，请稍后再试");
		}
	}
}
