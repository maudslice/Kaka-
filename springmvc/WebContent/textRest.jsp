<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="font-size:30px;">
<form action="order" method="post">
		<input type="hidden" name="_method" value="PUT"/>
		<input type="submit" value="REST PUT"/>
	</form>
	<br/>
	<br/>
	
	<!-- 添加一个新的订单 -->
	<form action="order" method="post">
		<input type="submit" value="REST POST"/>		
	</form>
	<br/>
	<!-- 删除id为1001的订单 -->
	<form action="order/1001" method="post">
		<!-- 隐藏域· -->
		<input type="hidden" name="_method" value="DELETE"/>
		<input type="submit" value="REST DELETE"/>
	</form>
	<br/>
	<!-- 查询id为1001的订单 -->
	<a href="order/1001">REST GET</a>
	<br/>

</body>
</html>