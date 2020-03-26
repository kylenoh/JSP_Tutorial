<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "tutorial";
		String pw = "12341234";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,id,pw);
			stmt=con.createStatement();
			String sql = "SELECT * FROM BOARD";
			result = stmt.executeQuery(sql);
%>

<body>
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
<%
			while (result.next()) {
				out.print("<tr>");
				out.print("<td>"+result.getString("BOARD_IDX")+"</td>");
				out.print("<td><a href='content.jsp?BOARD_IDX="+result.getString("BOARD_IDX")+"'>"+result.getString("BOARD_TITLE")+"</a></td>");
				out.print("<td>"+result.getString("BOARD_WRITER")+"</td>");
				out.print("<td>"+result.getString("BOARD_WRITEDATE")+"</td>");
				out.print("<td>"+result.getString("BOARD_COUNT")+"</td>");
				out.print("</tr>");
			}
%>
		</tbody>
	</table>
	
	<!-- WebContent/Board/write.jsp �� �̵��մϴ�. -->
	<a href="write.jsp">�۾���� �̵�</a>
	
<%
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

%>
</body>
</html>