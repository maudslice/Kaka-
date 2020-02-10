<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body style="font-size:30px;">
<form action="uploadImage" method="post" enctype="multipart/form-data">
  选择图片:<input type="file" name="image" accept="image/*" /> <br>
  <input type="submit" value="上传">
</form>

</body>
</html>