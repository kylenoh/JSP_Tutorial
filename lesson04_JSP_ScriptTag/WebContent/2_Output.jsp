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
		//	���� ������ �±� �ȿ� �޼ҵ带 �����մϴ�.
		public int add(int a, int b) {
			return a + b;
		}
	
		public int minus(int aa, int bb) {
			return aa - bb;
		}
	%>
	<%
		// doGet, doPost �Ѵ� �����մϴ�.
		//	2_Input.html ���� ���� �޾� �ɴϴ�.
		int x = Integer.parseInt(request.getParameter("xx"));
		int y = Integer.parseInt(request.getParameter("yy"));
		int a = add(x, y);
	%>
		<h1>�����</h1>
		<hr>
		<p>���ϱ� ���� ����մϴ�<%=a%></p>
		<p>���� ���� ����մϴ�<%=minus(x, y)%></p>
	
</body>
</html>






