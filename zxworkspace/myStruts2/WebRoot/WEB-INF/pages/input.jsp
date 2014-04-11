<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>login</title>
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
				<div id="header">
					<div id="rightheader">
						<p>
							2009/11/20
							<br />
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">Zhuxin</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						login
					</h1>
					<form action="product-save.action" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									ProductName:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="ProductName" />
									<span style="color:red;">${login_err}</span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									ProductDesc:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="ProductDesc" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									ProductPrice:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="ProductPrice" />
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" value="Submit &raquo;" />
						</p>
					</form>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
					ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
