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
		//	선언 지시자 태그 안에 메소드를 선언합니다.
		public int add(int a, int b) {
			return a + b;
		}
	
		public int minus(int aa, int bb) {
			return aa - bb;
		}
	%>
	<%
		// doGet, doPost 둘다 가능합니다.
		//	2_Input.html 에서 값을 받아 옵니다.
		int x = Integer.parseInt(request.getParameter("xx"));
		int y = Integer.parseInt(request.getParameter("yy"));
		int a = add(x, y);
	%>
		<h1>계산결과</h1>
		<hr>
		<p>더하기 값을 출력합니다<%=a%></p>
		<p>빼기 값을 출력합니다<%=minus(x, y)%></p>
	
</body>
</html>






