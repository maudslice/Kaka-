package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CommentServlet
 */
public class CommentServlet extends HttpServlet {
	
   public CommentServlet() {
	// TODO Auto-generated constructor stub
	   System.out.println("CommentServlet构造器");
}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("CommentServlet的service方法开始执行");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String content = request.getParameter("content");
		System.out.println("content:" + content);
		
		response.getWriter().println("你的评论是" + content);
		
		System.out.println("CommentServlet的service方法结束");
	}

}
