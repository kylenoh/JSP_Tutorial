<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!--  JSTL Core  -->
	
	<!--  ���� ���� 	-->
	<c:set var="helloJSTL" value="JSTL�Դϴ�." />
	<h3>${helloJSTL}</h3>
	<c:remove var="helloJSTL" />
	${helloJSTL}
	<c:set var="helloJSTL" value="JSTL�Դϴ�." />
	<c:set var="now" value="<%=new java.util.Date()%>" />
	<h3>${now}</h3>
	<c:set var="login" value="true" />
	<h3>${login}</h3>
	
	<!-- if ���� -->
	<c:if test="${login}">
		<p>
			<a href="/loginOK.jsp">�α���</a>
		</p>
	</c:if>

	<!-- if - else ���� -->
	<c:choose>
		<c:when test="${login}">
			<p>
				<a href="/loginOUT.jsp">�α׾ƿ�</a>
			</p>
		</c:when>
		<c:otherwise>
			<p>
				<a href="/login.jsp">�α���</a>
			</p>
		</c:otherwise>
	</c:choose>

	<!--  for ���� 	-->
	<c:forEach var="i" begin="0" end="10" step="1" varStatus="lastValue">
		<p>
			i = ${i}
			<c:if test="${lastValue.last}">
				last = ${i}
			</c:if>
		</p>
	</c:forEach>
	
	<!-- forEach ���� -->
	<c:forEach var="eachValue" items="${list}" varStatus="varValue">
		<p>(${varValue.index}) = ${eachValue.listAttribute}</p>
	</c:forEach>
	
	<!--  JSTL Formating  -->
	
	<!--  ��¥ ���� ��ȭ 	-->	
	<p>
		pattern 1 :
		<fmt:formatDate value="${now}" pattern="yyyy-MM-dd" />
	</p>
	<p>
		pattern 2 :
		<fmt:formatDate value="${now}" pattern="yyyy-MM-dd  hh:mm:ss" />
	</p>

	<!--  JSTL Function  -->
	
	<!--  ���ڿ� Function�� �ҷ��� ����� �� �־��ϴ�. 	-->	

	<p>${fn:substring(helloJSTL,3,6)}</p>
</body>
</html>