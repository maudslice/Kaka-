package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import entity.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		
		String uname = request.getParameter("username");
		String pwd = request.getParameter("pwd");
//		System.out.println(uname + ":" + pwd);
		
		try {
			UserDao dao = new UserDao();
			User user = dao.find(uname);
			if ((user != null) && user.getPwd().equals(pwd)) {
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				System.out.println("sessionId:" + session.getId());
				response.sendRedirect("list");
			}else {
				request.setAttribute("login_fail", "用户名或密码错误");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
