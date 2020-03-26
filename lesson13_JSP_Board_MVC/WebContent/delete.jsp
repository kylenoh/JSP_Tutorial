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
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,id,pw);
			stmt=con.createStatement();
			String sql = "DELETE FROM BOARD WHERE BOARD_IDX ="+BOARD_IDX;
			int result = stmt.executeUpdate(sql);
			
			if (result==1) {
				out.print("DELETE SUCCESS");
			}else {
				out.print("DELETE FAIL");
			}
		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}finally {
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					out.println(e.getMessage());
				}
			}
			if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					out.println(e.getMessage());
				}
			}
			out.print("<script>location.href='index.jsp';</script>");
		}
%>
<body>

</body>
</html>