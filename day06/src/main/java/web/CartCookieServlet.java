package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CartCookieServlet
 */
public class CartCookieServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		
		Cookie[] cookies =  request.getCookies();
		if (cookies != null) {
			boolean flag = false;
			for(Cookie cookie : cookies) {
				String name = cookie.getName();
				if ("cart".equals(name)) {
					flag = true;
					String value = cookie.getValue();
					out.println(value);
					break;
				}
			}
			if (!flag) {
				Cookie cart = new Cookie("cart", "001");
				response.addCookie(cart);
			}
			
		}else {
			Cookie cart = new Cookie("cart", "001");
			response.addCookie(cart);
		}
		
	}

}
