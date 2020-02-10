<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    import = "dao.*,entity.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	String username = request.getParameter("username");
	String pwd = request.getParameter("pwd");
	String email = request.getParameter("email");
	
	try {
		UserDao dao = new UserDao();
		User user = new User();
		
		user.setUsername(username);
		user.setPwd(pwd);
		user.setEmail(email);
		dao.save(user);
		
		response.sendRedirect("listUser1.jsp");
		
	} catch (Exception e) {
		e.printStackTrace();
		out.println("系统繁忙，请稍后再试！");
	}
%>

</body>
</html>