<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>add user</title>
</head>
<body>
	<form action="add" method="post">
		<fieldset>
			<legend>添加用户</legend>
			用户名：<input name="username" /><br> 
			密码：<input type="password" name="pwd" /><br> 
			邮箱：<input name="email" /><br> 
			<input type="submit" value="确定">
		</fieldset>
		
	</form>
	

</body>
</html>