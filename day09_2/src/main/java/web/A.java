package web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class A
 */
public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext sctx = getServletContext();
		System.out.println("sctx:" + sctx);
		
		//在上下文对象上绑定数据
		sctx.setAttribute("username", "kaka");
		
		HttpSession session = request.getSession();
		System.out.println("sessionID:" + session.getId());
		//在session对象上绑数据
		session.setAttribute("city", "kunming");
		
		String college = sctx.getInitParameter("college");
		System.out.println("college:" + college);
	}

}
