<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session = request.getSession();
		out.print("sessionId : "+session.getAttribute("sessionId")+"<br>");
	%>
	
	<hr>
	
	<a href="logout">로그아웃</a>
	
</body>
</html>