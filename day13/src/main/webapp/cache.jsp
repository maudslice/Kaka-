<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    import = "dao.*,entity.*,java.util.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="font-size:30px;">
java片段输出
<br>
<% 
	List<User>users = (List<User>)application.getAttribute("users");
	for(User u : users){
		out.print(u.getUsername() + " ");
		out.println(u.getPwd());
	}
%>
<br>
上下文输出
<br>
<%= session.getServletContext().getAttribute("users") %>
<br>
应用输出
<br>
<%=application.getAttribute("users") %>

</body>
</html>