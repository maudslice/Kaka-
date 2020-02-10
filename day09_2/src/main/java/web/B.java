package web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class B
 */
public class B extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public B() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//��ȡ��A�ϵ������İ󶨵�����
		ServletContext sctx = getServletContext();
		String username = (String)sctx.getAttribute("username");
		System.out.println("username:" + username);
		
		//��ȡ��A�ϵ�session�ϰ󶨵�����
		HttpSession session = request.getSession();
		System.out.println("sessionID:" + session.getId());
		String city = (String)session.getAttribute("city");
		System.out.println("city:" + city);
		String college = sctx.getInitParameter("college");
		System.out.println("college:" + college);
	}

}
