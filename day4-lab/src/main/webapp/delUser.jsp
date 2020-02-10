<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    import = "dao.*,entity.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>del user</title>
</head>
<body>
<%
	String id = request.getParameter("id");


	try {
		UserDao dao = new UserDao();
		dao.del(Integer.parseInt(id));
	
		response.sendRedirect("listUser1.jsp");
} catch (Exception e) {
		e.printStackTrace();
		out.print("系统繁忙，请稍后再试");
}
%>

</body>
</html>