<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>비만도 검사</title>
<link rel="stylesheet" href="css/NewFile.css">
</head>
<body>
	<table>
		<tr>
			<td class="td1" align="right">이름</td>
			<td class="td2">${person.name }</td>
		</tr>
		<tr>
			<td class="td1" align="right">키</td>
			<td class="td2">${person.height }cm</td>
		</tr>
		<tr>
			<td class="td1" align="right">몸무게</td>
			<td class="td2">${person.weight }kg</td>
		</tr>
		<tr>
			<td class="td1" align="right">BMI</td>
			<td class="td2">${person.bmi }</td>
		</tr>
		<tr>
			<td align="center" colspan="2" class="td2" style="color:red; font-size: 15pt;">
				${person.result }
			</td>
		</tr>
	</table>
</body>
</html>