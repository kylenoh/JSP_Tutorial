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
	<h4>MVC1 게시판</h4>
	
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
	
	<!-- WebContent/Board/write.jsp 로 이동합니다. -->
	<a href="write.jsp">글쓰기로 이동</a>
	
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