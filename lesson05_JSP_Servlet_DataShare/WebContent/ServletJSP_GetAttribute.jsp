<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page errorPage="ErrorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<%!
		String developer;
		String devServer;
		String AdminId;
	%>
	
	<%
		// developer는 Context로 만들어 setAttribute를 진행하였습니다.
		developer = (String)application.getAttribute("developer");
		// devServer는 Context로 만들어 setAttribute하지 않았습니다.
		devServer = application.getInitParameter("devServer");
		//	AdminId 는 ServletJSP_GetAttribute init-Param에 지정되어 있습니다.
		AdminId=config.getInitParameter("adminId");
	%>
	
	<p>developer : <%= developer%></p>
	<p>devServer : <%= devServer%></p>
	<p>AdminId : <%= AdminId%></p>
</body>
</html>