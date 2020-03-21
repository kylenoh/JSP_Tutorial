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
	<!-- HTML 주석입니다. -->
	<%--JSP 주석입니다. (컴파일에서 제외됩니다.)--%>
	
	
	<%@ include file="1_Header.html" %>
	
	<%-- JSP 선언 태그입니다. --%>
	<%!
		int number = 10;
		String str = "안녕하세요";
		ArrayList<String> list = new ArrayList<String>();
		
		public void jspMethod(){
			System.out.println("JSP 페이지에서 만든 메서드입니다.");
		}
	%>
	
	<%--JSP 스크립트 태그 입니다. --%>
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
	
	<%--JSP 표현식 태그 입니다. --%>
	Number 는 <%=number %> 입니다.
	
	<%@ include file="1_Footer.html" %>
</body>
</html>