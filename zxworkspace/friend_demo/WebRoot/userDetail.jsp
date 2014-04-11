<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<html>
	<head>
		<title>update Emp</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
							<a href="#">Main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>

				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						User Detail:
					</h1>
					<table class="table">
						<tr>
							<td>
								姓名
							</td>
							<td>
								电话
							</td>
						</tr>
						<tr>
							<td>
								<!--${param.username}-->
								<%
								//链接有中文参数的解决办法，链接当中包含了中文参数，浏览器会对中文
								//参数进行编码，编码依据打开该页面时的编码。如果请求发送方式是get方式，不能够使用
								//request.setCharacterEncoding()!
								String name=request.getParameter("username");
								name=new String(name.getBytes("iso8859-1"),"utf-8");
								out.println(name);
								 %>
							</td>
							<td>
								${param.phone}
							</td>
						</tr>
					</table>
					<%  
						Integer currID=(Integer)session.getAttribute("currID");
						if(currID==null){%>
						<%@include file="photo3.jsp" %>	
						<%}else{
						int i=Integer.parseInt(request.getParameter("id"));
						int j=(Integer)session.getAttribute("currID");
						if(i==j){
					%>
					<%@include file="photo.jsp" %>
					<%}else{ %>
					<%@include file="photo2.jsp" %>
					<%}%>
					<%}%>
				</div>
				<input type="button" class="button" value="Return &raquo;" onclick="location='userList.jsp'" />
			</div>
			<div id="footer">
				<div id="footer_bg">
					ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
