<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%
		request.setCharacterEncoding("EUC-KR"); 
		String BOARD_IDX = request.getParameter("BOARD_IDX");

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
			String sql = "SELECT * FROM BOARD WHERE BOARD_IDX ="+BOARD_IDX;
			result = stmt.executeQuery(sql);
			
			while (result.next()) {
%>
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
<%
				out.print("<tr>");
				out.print("<td>"+result.getString("BOARD_IDX")+"</td>");
				out.print("<td>"+result.getString("BOARD_TITLE")+"</td>");
				out.print("<td>"+result.getString("BOARD_WRITER")+"</td>");
				out.print("<td>"+result.getString("BOARD_WRITEDATE")+"</td>");
				out.print("<td>"+result.getString("BOARD_COUNT")+"</td>");
				out.print("</tr>");
				out.print("<tr>");
				out.print("<td colspan='5'>"+result.getString("BOARD_CONTENT")+"</td>");
				out.print("</tr>");
 %>		
		</tbody>
	</table>
	
	<a href="../index.jsp">������� �̵�</a>
	<a href="../delete.jsp?BOARD_IDX=+<%=result.getString("BOARD_IDX") %>">����</a>
<%
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

%>
</body>
</html>