<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%!
		String AdminId;
		String AdminPw;
		String imageDirectory;
		String devServer;
		String developer;
		String str;
	%>
	
	<%
		AdminId=config.getInitParameter("adminId");
		AdminPw=getServletConfig().getInitParameter("adminPw");
	%>
	<h6>init Param에 담긴 값입니다.</h6>
	<p>AdminId : <%= AdminId%></p>
	<p>AdminPw : <%= AdminPw%></p>
	
	<%
		imageDirectory = application.getInitParameter("imageDirectory");
		devServer = application.getInitParameter("devServer");
		developer = application.getInitParameter("developer");
	%>
	<h6>Context-Param에 담긴 값입니다.</h6>
	<p>imageDirectory : <%= imageDirectory%></p>
	<p>devServer : <%= devServer%></p>
	<p>developer : <%= developer%></p>
	
	<%
		application.setAttribute("developer", "kyle");
	%>
	
	<!-- OUT 객체 -->
	<%
		out.print("<h3>Hello JSP World</h3>");
		out.print("<h3>Hello JSP World</h3>");
		out.print("<h3>Hello JSP World</h3>");
	%>

</body>
</html>