<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    import = "dao.*,entity.*,java.util.*,java.util.*"%>
<!DOCTYPE html>
<html>
	<head>
		<title>登录</title>
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
					<form action="login.do" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									username:
								</td>
								
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="username" />
									
									<span style="font-size:24px; color:red">
											${login_fail }
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