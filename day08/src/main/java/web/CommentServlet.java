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
	   System.out.println("CommentServlet������");
}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("CommentServlet��service������ʼִ��");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String content = request.getParameter("content");
		System.out.println("content:" + content);
		
		response.getWriter().println("���������" + content);
		
		System.out.println("CommentServlet��service��������");
	}

}
