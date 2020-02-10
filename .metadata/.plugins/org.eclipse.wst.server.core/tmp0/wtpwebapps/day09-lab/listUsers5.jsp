<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    import = "dao.*,entity.*,java.util.*,java.util.*"%>
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
						<%
	
	List<User>users = (List<User>)request.getAttribute("users");
	
	for (int i = 0; i <users.size(); i ++) {
		User u = users.get(i);
	%>
	<tr class = "row<%= i % 2 + 1 %>">
		<td><%=u.getId() %></td>
		<td><%=u.getUsername() %></td>
		<td><%=u.getPwd() %></td>
		<td><%=u.getEmail() %></td>
		<td><a href = "del.do?id=<%= u.getId()%>" onclick="return confirm('确定删除<%=u.getUsername()%>用户吗？');">删除</a></td>
		
	</tr>
	
	<% } %>
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