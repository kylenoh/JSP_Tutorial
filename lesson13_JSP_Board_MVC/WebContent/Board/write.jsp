<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>�ۼ� �������Դϴ�</h3>
	<form action="../insert.jsp" method="post">
		<table>
			<tr>
				<td>
					<label>����</label>
				</td>
				<td>
					<input type="text" name="board_title">
				</td>
			</tr>
			<tr>
				<td>
					<label>�ۼ���</label>
				</td>
				<td>
					<input type="text" name="board_writer">
				</td>
			</tr>
			<tr>
				<td>
					<label>����</label>
				</td>
				<td>
					<textarea cols="20" rows="10" name="board_content"></textarea>
				</td>
			</tr>
			<tr>
				<td>
					<button type="submit">�� �ۼ�</button>
				</td>
			</tr>
		</table>
	</form>	
</body>
</html>