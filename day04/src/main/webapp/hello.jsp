<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-size:30px">
time
	<%
	Date date = new Date();
	out.println(date);
	%>
	<br>
	<%= new Date() %>
	<br>
	<%
	for(int i = 0; i < 100; i ++){
		out.println("hello kitty</br>");
	}
	%>
</body>
</html>