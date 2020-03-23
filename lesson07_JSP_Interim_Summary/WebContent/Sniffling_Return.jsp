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
		String result;
	%>

	<%
		result = (String)request.getAttribute("result");
	%>
	<h3>결과는 <%=result %>수</h3>
</body>
</html>