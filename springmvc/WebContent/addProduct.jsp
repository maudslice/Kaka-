<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.*" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="font-size: 30px;">
	<form action="addProduct" method="post">

		产品名称 ：<input type="text" name="name" value=""><br /> 
		产品价格： <input type="text" name="price" value=""><br /> 
		<input type="submit" value="增加商品">
	</form>

</body>
</html>