<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- HTML �ּ��Դϴ�. -->
	<%--JSP �ּ��Դϴ�. (�����Ͽ��� ���ܵ˴ϴ�.)--%>
	
	
	<%@ include file="1_Header.html" %>
	
	<%-- JSP ���� �±��Դϴ�. --%>
	<%!
		int number = 10;
		String str = "�ȳ��ϼ���";
		ArrayList<String> list = new ArrayList<String>();
		
		public void jspMethod(){
			System.out.println("JSP ���������� ���� �޼����Դϴ�.");
		}
	%>
	
	<%--JSP ��ũ��Ʈ �±� �Դϴ�. --%>
	<%
		if(number>0){
	%>
		<p>Number &gt;  0</p>
	<%
		}else{
	%>		
		<p>Number &lt;=  0</p>
	<%
		}
	%>
	
	<%--JSP ǥ���� �±� �Դϴ�. --%>
	Number �� <%=number %> �Դϴ�.
	
	<%@ include file="1_Footer.html" %>
</body>
</html>