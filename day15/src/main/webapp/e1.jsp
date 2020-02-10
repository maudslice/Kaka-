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
		User user = new User();
		user.setUsername("king");
		user.setAge(18);
		user.setInterest(new String[]{"cooking", "runnning"});
		request.setAttribute("user", user);
	%>
	获取用户名信息：<br>
	<%--
		<% 
			User u = request.getAttribute("User");
		%>
		username:<%=u.getUsername %>
	 --%>
	用el表达式获取用户信息：
	username:${user.username}
	<br>
	用el表达式获取用户信息方式2：
	username:${user['username']}
	<br>
	制定查找范围获取用户信息：
	username:${requestScope.user.username}
	<br>
	获取数组中的元素：
	interest:${user.interest[0]}
	<br>
	<%
		request.setAttribute("prop", "age");
	%>
	用el表达式获取用户信息方式3：先绑定属性，再根据绑定的属性来获取
	<br>
	用户年龄:${user[prop]}
	<br>
	用户年龄:${user[requestScope.prop]}
	<br>


</body>
</html>