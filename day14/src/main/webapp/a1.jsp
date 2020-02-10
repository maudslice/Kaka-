<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="font-size:30px;">
	<%!
	int i = 100;
	int sum(int a1, int a2){
		return a1 + a2;
	}
	%>
	i的值为：<%=i + 100 %>
	<br>
	<br>
	sum的值:<%= sum(1, 1) %>

</body>
</html>