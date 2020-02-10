<%@page import="bean.User2"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    import="bean.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="font-size:30px;">
	<%
		User2 user = new User2();
		user.setUsername("libai");
		user.setGender("f");
		request.setAttribute("user", user);
	%>
	用户名：${user.username}<br>
	性别：${user.gender}<br>
	性别：<c:if test="${user.gender=='m'}">男</c:if><br>
	性别：<c:if test="${user.gender!='m'}">女</c:if><br>
	性别：<c:if test="${user.gender=='m'}" var="rs" scope="page">男</c:if><br>
	性别：<c:choose>
			<c:when test="${user.gender=='m'}">男</c:when>
			<c:when test="${user.gender=='f'}">女</c:when>
			<c:otherwise>保密</c:otherwise>
		</c:choose>

</body>
</html>