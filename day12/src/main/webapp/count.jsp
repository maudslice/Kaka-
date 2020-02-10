<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	sessionID: <%= session.getId() %>
	当前在线人数<%= session.getServletContext().getAttribute("count") %>

</body>
</html>