<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-size:30px">
	this is b1<br/>
	<a href="../b2.jsp">visit b2</a><br/>
	<a href="<%= request.getContextPath() %>/b2.jsp">visit b2(absolute)</a>
</body>
</html>