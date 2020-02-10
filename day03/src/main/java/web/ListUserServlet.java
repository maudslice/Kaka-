package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import entity.User;

public class ListUserServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html;charset = utf-8");
		PrintWriter out = response.getWriter();
		
		try {
			UserDao dao = new UserDao();
			List<User> users = dao.findAll();

			out.println("<table border = '1' width = '60%' cellpadding = '0' cellspacing = '0'>");
			out.println("<tr><td>ID</td><td>用户名</td><td>密码</td><td>邮箱</td><td>操作</td></tr>");

			for (User u : users) {
				int id = u.getId();
				String username = u.getUsername();
				String pwd = u.getPwd();
				String email = u.getEmail();

				out.println("<tr>" 
						+ "<td>" + id + "</td>" 
						+ "<td>" + username + "</td>" 
						+ "<td>" + pwd + "</td>"
						+ "<td>" + email + "</td>" 
						+ "<td><a href = 'del?id=" + id + "'>删除</a></td>"
						+ "</tr>");

			}
			out.println("</table>");
			out.println("<p><a href = 'addUserServlet.html'>添加用户</a></p>");

		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.print("系统繁忙，请稍后再试");
		}
	}

}
