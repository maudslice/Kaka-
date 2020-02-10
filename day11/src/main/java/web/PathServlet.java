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
		
		//�ض���,����·������/��ͷ����Ӧ������ʼд
		response.sendRedirect(request.getContextPath() + "/biz01/b1.jsp");
		
		//�ض���,���·������Ӧ������ʼд
		response.sendRedirect("biz01/b1.jsp");
		
		//ת��������·������/��ͷ����Ӧ������ʼд
		request.getRequestDispatcher("/biz01/b1.jsp").forward(request, response);
		//ת�������·������Ӧ������ʼд
	}

}
