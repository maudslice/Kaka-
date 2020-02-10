<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    import="bean.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="font-size:30px;">
	<%
		Employee employee = new Employee("wangdachui", 5000, 26);
		request.setAttribute("employee", employee);
		
	%>
	
	<br>
	employee:${employee.toString()}
	<br>


</body>
</html>