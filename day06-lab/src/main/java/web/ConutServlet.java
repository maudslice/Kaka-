package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.CookieUtil;

/**
 * Servlet implementation class ConutServlet
 */
public class ConutServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String count =  CookieUtil.findCookie("count", request);
		if (count == null) {
			CookieUtil.addCookie("count", "1", 30*24*60*60, "/day06-lab", response);
//			out.print("你是第一次访问");
		}else {
			int v = Integer.parseInt(count) + 1;
			CookieUtil.addCookie("count", v + "", 30*24*60*60, "/day06-lab", response);
			out.print("你是第" + v + "次访问！");
		}
	}

}
