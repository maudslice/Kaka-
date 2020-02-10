<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    import = "dao.*,entity.*,java.util.*,java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>listUsers</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<style>
			.row0{
				background-color: #f0f0f0;
			}
			.row1{
				background-color: #fff8dc;
			}
		</style>
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<%@include file="head.jsp" %>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								Username
							</td>
							<td>
								Pwd
							</td>
							<td>
								Email
							</td>
							<td>
								Operation
							</td>
						</tr>
  <c:forEach items="${users}" var="u" varStatus="s">		
	<tr class = "row${s.index%2}">
		<td>${u.id}</td>
		<td>${u.username}</td>
		<td>${u.pwd}</td>
		<td>${u.email}</td>
		<td><a href = "del.do?id=${u.id }" onclick="return confirm('确定删除${u.username }用户吗？');">删除</a></td>
	</tr>
	</c:forEach>
	
	
					</table>
					<p>
						<input type="button" class="button" value="Add User" onclick="location='addUser.jsp'"/>
					</p>
				</div>
			</div>
			<%@include file="foot.jsp" %>
		</div>
	</body>
</html>