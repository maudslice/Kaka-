package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import entity.User;

/**
 * Servlet implementation class ActionServlet
 */
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		
		String uri = request.getRequestURI();
		System.out.println("uri:" + uri);
		
		String path = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf("."));
		
		System.out.println("path:" + path);
		
		if ("/login".equals(path)) {
			processLogin(request,response);
			
		}else if ("/add".equals(path)) {
			processAdd(request,response);
			
		}else if ("/list".equals(path)) {
			processList(request,response);
			
		}else if ("/del".equals(path)) {
			processDel(request,response);
			
		}
		
	}



	private void processDel(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		
		
		HttpSession session = request.getSession();
		System.out.println("sessionId:" + session.getId());
		Object obj = session.getAttribute("user");
		if (obj == null) {
			response.sendRedirect("login.jsp");
			return;
		}
		
		String id = request.getParameter("id");
		
		
		try {
			UserDao dao = new UserDao();
			dao.del(Integer.parseInt(id));
			
			response.sendRedirect("list.do");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("error", "系统繁忙，请稍后再试");
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
		
	}

	private void processList(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		System.out.println("sessionId:" + session.getId());
		Object obj = session.getAttribute("user");
		if (obj == null) {
			response.sendRedirect("login.jsp");
			return;
		}
		
		try {
			UserDao dao = new UserDao();
			List<User>users = dao.findAll();
//			绑定转发对象
			request.setAttribute("users", users);
//			获得转发器
			RequestDispatcher rd = request.getRequestDispatcher("listUsers5.jsp");
//			调用转发器的方法转发
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("error", "系统繁忙，请稍后再试");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("error", "系统繁忙，请稍后再试");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		
	}

	private void processAdd(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		System.out.println("sessionId:" + session.getId());
		Object obj = session.getAttribute("user");
		if (obj == null) {
			response.sendRedirect("login.jsp");
			return;
		}
		
		//通过请求对象获取表单中提交的参数
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		System.out.println(username + " " + pwd + " " + email);
		
		response.setContentType("text/html;charset = utf-8");
		PrintWriter out = response.getWriter();
		
		
		UserDao dao = new UserDao();
		User user = null;
		try {
			
			user = dao.find(username);
			if (user != null) {
				request.setAttribute("addUser_fail", "该用户已存在，重新输入");
				request.getRequestDispatcher("addUser.jsp").forward(request, response);
			}else {
				user = new User();
				user.setUsername(username);
				user.setPwd(pwd);
				user.setEmail(email);
				dao.save(user);
			
				response.sendRedirect("list.do");
			}
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("error", "系统繁忙，请稍后再试");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("error", "系统繁忙，请稍后再试");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		
	}

	private void processLogin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		// TODO Auto-generated method stub
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
				response.sendRedirect("list.do");
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
