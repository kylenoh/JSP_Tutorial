<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h4>������ �������Դϴ�.</h4>
	
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
	
	<a href="index.html">������� �̵�</a>
	<a href="deleteController?BOARD_IDX=+${boardVar.board_idx }">����</a>
</body>
</html>