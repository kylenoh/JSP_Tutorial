<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- JSTL 사용을 위한 선언부 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


<body>
	<h4>컨트롤러에서 전달받은 값을 출력합니다. ${result }</h4>
	
	<h4>MVC1 게시판</h4>
	
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="boardVar" items="${BOARD }">
				<tr>
					<td>${boardVar.board_idx }</td>
					<td><a href="contentController?BOARD_IDX=${boardVar.board_idx }">${boardVar.board_title }</a></td>
					<td>${boardVar.board_writer }</td>
					<td>${boardVar.board_writedate }</td>
					<td>${boardVar.board_count }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<!-- WebContent/Board/write.jsp 로 이동합니다. -->
	<a href="Board/write.jsp">글쓰기로 이동</a>
</body>
</html>