<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'login.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		<div id="content">
			<p id="whereami">
			</p>
			<h1>
				login
			</h1>
			<form action="user_login.do" method="get">
				<table cellpadding="0" cellspacing="0" border="0" class="form_table">
					<tr>
						<td valign="middle" align="right">
							UserName:
						</td>
						<td valign="middle" align="left">
							<input type="text" class="inputgri" name="UserName" />
						</td>
					</tr>
					<tr>
						<td valign="middle" align="right">
							Password:
						</td>
						<td valign="middle" align="left">
							<input type="password" class="inputgri" name="Password" />
						</td>
					</tr>
				</table>
				<p>
					<input type="submit" class="button" value="Submit &raquo;" />
				</p>
			</form>
		</div>
	</body>
</html>
