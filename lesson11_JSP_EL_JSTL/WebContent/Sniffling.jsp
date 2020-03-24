<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="SnifflingServlet" method="post">
		<table>
			<tr>
				<td colspan="2" align="center"><h2>홀짝판별</h2></td>
			</tr>
			<tr>
				<td align="center">숫자</td>
				<td>
					<input name="number" placeholder="반드시 입력/숫자만" autocomplete="off" autofocus="autofocus">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">판별하기</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>