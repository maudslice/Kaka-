<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    import = "dao.*,entity.*,java.util.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>add User</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="css/style.css" />
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
				<%@include file="head.jsp" %>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						add User info:
					</h1>
					<form action="add.do" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									username:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="username" />
									<%
									String msg = (String)request.getAttribute("addUser_fail");
									%>
									<span style="font-size:24px; color:red">
									<%= (msg== null)?"":msg %>
									</span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									pwd:
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" name="pwd" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									email:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="email" />
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" value="Confirm" />
						</p>
					</form>
				</div>
			</div>
			<%@include file="foot.jsp" %>
		</div>
	</body>
</html>
