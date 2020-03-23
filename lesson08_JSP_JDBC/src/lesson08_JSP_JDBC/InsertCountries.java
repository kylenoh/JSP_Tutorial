package lesson08_JSP_JDBC;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertCountries")
public class InsertCountries extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "HR";
		String pw = "12341234";
		PrintWriter out = response.getWriter();
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,id,pw);
			stmt=con.createStatement();
			String sql = "INSERT INTO COUNTRIES (COUNTRY_ID,COUNTRY_NAME,REGION_ID)VALUES('KR','KOREA',2)";
			int result = stmt.executeUpdate(sql);
			
			if (result==1) {
				out.print("INSERT SUCCESS");
			}else {
				out.print("INSERT FAIL");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
