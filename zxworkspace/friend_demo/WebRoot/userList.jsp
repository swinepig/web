<%@ page language="java" import="java.util.*,dao.impl.*,dao.*,entity.User,redis.dao.*,redis.dao.imp.*" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="content-type" content="text/html;charset=utf-8"/>
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
						Welcome!
					</h1>
					
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								Username
							</td>
							<td>
								Gendar
							</td>
							<td>
								Age
							</td>
							<td>

							</td>
						</tr>
						<%
						//RedisDao dao = new RedisDaoImpl();
						UserDao dao = new UserDaoImpl();
						List<User> list=dao.findAll();
						session.setAttribute("list",list);
						%>
						 <c:forEach var="user" items="${list}" varStatus="status" >
						<tr class="row${(status.index)%2+1}">
							<td>
								${user.id}
							</td>
							<td>
								${user.username}
							</td>
							<td>
								${user.sex}
							</td>
							<td>
								${user.age}
							</td>
							<td>
								<a href="userDetail.jsp?id=${user.id}&username=${user.username}&phone=${user.phone}">详细</a>
								
							</td>
						</tr>
							</c:forEach>
					</table>
					<p>
						<input type="button" class="button" value="退出系统"
							onclick="location='login.jsp'" />
					</p>
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
