<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-size:30px">
	this is b2<br/>
	<a href="biz01/b1.jsp">visit b1</a><br/>
	<a href="<%= request.getContextPath() %>/biz01/b1.jsp">visit b1(absolute)</a>
</body>
</html>