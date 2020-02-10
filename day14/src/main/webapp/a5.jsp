<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="font-size:30px;">
	1、request绑定数据
	<%request.setAttribute("city", "kmust"); %>
	<br>
	city :<%=request.getAttribute("city") %>
	<br>
	2、session绑定数据，对一个用户的多次请求有效
	<% session.setAttribute("interest", "kjaka"); %>
	<br>
	interest: <%=session.getAttribute("interest") %>
	<br>
	3.pageContext绑定数据，只在本jsp页面有效
	<% pageContext.setAttribute("username", "wdc"); %>
	<br>
	username :<%= pageContext.getAttribute("username") %>
	

</body>
</html>