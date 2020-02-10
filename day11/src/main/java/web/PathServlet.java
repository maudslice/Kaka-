package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PathServlet
 */
public class PathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PathServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		System.out.println("username" + username);
		
		//重定向,绝对路径。以/开头，从应用名开始写
		response.sendRedirect(request.getContextPath() + "/biz01/b1.jsp");
		
		//重定向,相对路径，从应用名开始写
		response.sendRedirect("biz01/b1.jsp");
		
		//转发，绝对路径，以/开头，从应用名后开始写
		request.getRequestDispatcher("/biz01/b1.jsp").forward(request, response);
		//转发，相对路径，从应用名后开始写
	}

}
