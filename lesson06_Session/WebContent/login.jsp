<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		if(session.getAttribute("memberId")!= null){
			response.sendRedirect("loginOK.jsp");
		}
	
	%>

	<form action="login" method="post">
		ID:<input type="text" name="form_name"><br>
		PW:<input type="password" name="form_password"><br>
		<input type="submit" value="login">
	</form>
</body>
</html>