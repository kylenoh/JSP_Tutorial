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
		// developer�� Context�� ����� setAttribute�� �����Ͽ����ϴ�.
		developer = (String)application.getAttribute("developer");
		// devServer�� Context�� ����� setAttribute���� �ʾҽ��ϴ�.
		devServer = application.getInitParameter("devServer");
		//	AdminId �� ServletJSP_GetAttribute init-Param�� �����Ǿ� �ֽ��ϴ�.
		AdminId=config.getInitParameter("adminId");
	%>
	
	<p>developer : <%= developer%></p>
	<p>devServer : <%= devServer%></p>
	<p>AdminId : <%= AdminId%></p>
</body>
</html>