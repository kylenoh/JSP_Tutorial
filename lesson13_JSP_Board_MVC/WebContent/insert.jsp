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
	request.setCharacterEncoding("EUC-KR"); 
	String board_title = request.getParameter("board_title");
	String board_writer = request.getParameter("board_writer");
	String board_content = request.getParameter("board_content");
	
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
		String sql = "INSERT INTO BOARD "+ 
					"(BOARD_IDX,BOARD_TITLE,BOARD_WRITER,BOARD_WRITEDATE,BOARD_COUNT,BOARD_CONTENT)"+
					"VALUES(BOARD_SEQ.NEXTVAL,'"+board_title+"', '"+board_writer+"', SYSDATE, 20, '"+board_content+"')";
		int result = stmt.executeUpdate(sql);
		
		if (result==1) {
			out.print("INSERT SUCCESS");
		}else {
			out.print("INSERT FAIL");
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
</body>
</html>