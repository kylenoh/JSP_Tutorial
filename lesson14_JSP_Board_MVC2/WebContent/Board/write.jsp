<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h4>작성 페이지입니다</h4>
	<!-- writeServlet으로 데이터를 전달합니다 -->
	<form action="../writeController" method="post">
		<table border="1">
			<tr>
				<td>
					<label>제목</label>
				</td>
				<td>
					<input type="text" name="board_title">
				</td>
			</tr>
			<tr>
				<td>
					<label>작성자</label>
				</td>
				<td>
					<input type="text" name="board_writer">
				</td>
			</tr>
			<tr>
				<td>
					<label>내용</label>
				</td>
				<td>
					<textarea cols="20" rows="10" name="board_content"></textarea>
				</td>
			</tr>
			<tr>
				<td>
					<button type="submit">글 작성</button>
				</td>
			</tr>
		</table>
	</form>	
</body>
</html>