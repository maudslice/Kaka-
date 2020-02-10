<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="a4.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="font-size:30px;">
 <%
 	String qty = (String)request.getParameter("qty");
 	Integer qty1 = Integer.parseInt(qty);
 	out.println(qty1 * 2);
 %>


</body>
</html>