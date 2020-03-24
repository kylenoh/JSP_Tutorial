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
	
	<!--  변수 선언 	-->
	<c:set var="helloJSTL" value="JSTL입니다." />
	<h3>${helloJSTL}</h3>
	<c:remove var="helloJSTL" />
	${helloJSTL}
	<c:set var="helloJSTL" value="JSTL입니다." />
	<c:set var="now" value="<%=new java.util.Date()%>" />
	<h3>${now}</h3>
	<c:set var="login" value="true" />
	<h3>${login}</h3>
	
	<!-- if 구문 -->
	<c:if test="${login}">
		<p>
			<a href="/loginOK.jsp">로그인</a>
		</p>
	</c:if>

	<!-- if - else 구문 -->
	<c:choose>
		<c:when test="${login}">
			<p>
				<a href="/loginOUT.jsp">로그아웃</a>
			</p>
		</c:when>
		<c:otherwise>
			<p>
				<a href="/login.jsp">로그인</a>
			</p>
		</c:otherwise>
	</c:choose>

	<!--  for 구문 	-->
	<c:forEach var="i" begin="0" end="10" step="1" varStatus="lastValue">
		<p>
			i = ${i}
			<c:if test="${lastValue.last}">
				last = ${i}
			</c:if>
		</p>
	</c:forEach>
	
	<!-- forEach 구문 -->
	<c:forEach var="eachValue" items="${list}" varStatus="varValue">
		<p>(${varValue.index}) = ${eachValue.listAttribute}</p>
	</c:forEach>
	
	<!--  JSTL Formating  -->
	
	<!--  날짜 패턴 변화 	-->	
	<p>
		pattern 1 :
		<fmt:formatDate value="${now}" pattern="yyyy-MM-dd" />
	</p>
	<p>
		pattern 2 :
		<fmt:formatDate value="${now}" pattern="yyyy-MM-dd  hh:mm:ss" />
	</p>

	<!--  JSTL Function  -->
	
	<!--  문자열 Function을 불러서 사용할 수 있씁니다. 	-->	

	<p>${fn:substring(helloJSTL,3,6)}</p>
</body>
</html>