<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- JSTL ����� ���� ����� -->
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
	<h4>��Ʈ�ѷ����� ���޹��� ���� ����մϴ�. ${result }</h4>
	
	<h4>MVC1 �Խ���</h4>
	
	<table border="1">
		<thead>
			<tr>
				<th>��ȣ</th>
				<th>����</th>
				<th>�ۼ���</th>
				<th>��¥</th>
				<th>��ȸ��</th>
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
	
	<!-- WebContent/Board/write.jsp �� �̵��մϴ�. -->
	<a href="Board/write.jsp">�۾���� �̵�</a>
</body>
</html>