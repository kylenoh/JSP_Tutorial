<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�񸸵� �˻�</title>
<link rel="stylesheet" href="css/NewFile.css">
</head>
<body>
	<table>
		<tr>
			<td class="td1" align="right">�̸�</td>
			<td class="td2">${person.name }</td>
		</tr>
		<tr>
			<td class="td1" align="right">Ű</td>
			<td class="td2">${person.height }cm</td>
		</tr>
		<tr>
			<td class="td1" align="right">������</td>
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