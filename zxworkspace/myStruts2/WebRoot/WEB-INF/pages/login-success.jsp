<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 
		request.setCharacterEncoding("UTF-8");
	%>
	
	Welcome: ${UserName }
	
	<br>
	
	你的密码是: ${Password} 
	
	<br>
	
	当前在线人数：${count }
	
	<br>
	
	<a href="user_logout.do">登出</a>
	
</body>
</html>