package web;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		//新建cookie对象，设置名和值
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		Cookie c1 = new Cookie("username", URLEncoder.encode("咔咔", "utf-8"));
		c1.setMaxAge(120);
		//服务器发送cookie给浏览器
		response.addCookie(c1);
		
		
	
	}

}
