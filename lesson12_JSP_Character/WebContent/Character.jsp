<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Output Servlet의 doGet을 호출 합니다. -->
		<h3>doGet 호출합니다.</h3>
	<form action="Character" method="get">
		한글테스트 : 	<input type="text" name="form_name"><br>
					<input type="submit" value="submit">
	</form>
	
	<hr>
	
	<!-- Output Servlet의 doPost을 호출 합니다. -->
	<h3>doPost 호출합니다.</h3>
	<form action="Character" method="post">
		한글테스트 :	<input type="text" name="form_name"><br>
					<input type="submit" value="submit">
	</form>
</body>
</html>