<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h4>컨텐츠 페이지입니다.</h4>
	
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
			<tr>
				<td>${boardVar.board_idx }</td>
				<td>${boardVar.board_title }</td>
				<td>${boardVar.board_writer }</td>
				<td>${boardVar.board_writedate }</td>
				<td>${boardVar.board_count }</td>
			</tr>
			<tr>
				<td colspan='5'>${boardVar.board_content }</td>
			</tr>
		</tbody>
	</table>
	
	<a href="index.html">목록으로 이동</a>
	<a href="deleteController?BOARD_IDX=+${boardVar.board_idx }">삭제</a>
</body>
</html>