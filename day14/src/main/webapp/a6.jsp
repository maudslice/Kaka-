<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="font-size:30px;">
	1、request
	<br>
	city :<%=request.getAttribute("city") %>
	<br>
	2、session
	<br>
	interest: <%=session.getAttribute("interest") %>
	<br>
	3.pageContext
	<br>
	username :<%= pageContext.getAttribute("username") %>


</body>
</html>