<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    import = "dao.*,entity.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
	.row1{
		background-color:gray;
	}
	.row2{
		background-color:#fff8dc;
	}
</style>
</head>
<body>
<table border = '1' width = '60%' cellpadding = '0' cellspacing = '0'>
	<tr>
		<td>ID</td>
		<td>用户名</td>
		<td>密码</td>
		<td>邮箱</td>
		<td>操作</td>
	</tr>
	
	<%
	UserDao dao = new UserDao();
	List<User> users = dao.findAll();
	
	for (int i = 0; i <users.size(); i ++) {
		User u = users.get(i);
	%>
	<tr class = "row<%= i % 2 + 1 %>">
		<td><%=u.getId() %></td>
		<td><%=u.getUsername() %></td>
		<td><%=u.getPwd() %></td>
		<td><%=u.getEmail() %></td>
		<td><a href = "delUser.jsp?id=<%= u.getId()%>">删除</a></td>
		
	</tr>
	
	<% } %>
</table>
<input type = "button" class = "button" value = "添加用户" onclick = "location = 'addUserServlet.jsp'"/>

</body>
</html>