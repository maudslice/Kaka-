package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CountServlet
 */
public class CountServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String sessionId = session.getId();
		System.out.println("sessionId:" + sessionId);
		
		Integer count = (Integer)session.getAttribute("count");
		if (count == null) {
			count = 1;
		}else {
			count ++;
		}
		
		session.setAttribute("count", count);
		out.print("您是第" + count + "次访问");
	}

}
