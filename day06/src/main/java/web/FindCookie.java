package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindCookie
 */
public class FindCookie extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		
		if (cookies != null) {
			for (Cookie c : cookies) {
				String name = c.getName();
				String Value = URLDecoder.decode(c.getValue(),"utf-8");
				URLDecoder.decode(c.getValue(),"utf-8");
				out.println(name + ":" + Value);
			} 
		}else {
			out.println("No Cookie!");
		}
	}

	

}
