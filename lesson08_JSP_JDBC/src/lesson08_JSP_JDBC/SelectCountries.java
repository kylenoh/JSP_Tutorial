package lesson08_JSP_JDBC;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectCountries")
public class SelectCountries extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "HR";
		String pw = "12341234";
		
		PrintWriter out = response.getWriter();
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;

		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,id,pw);
			stmt=con.createStatement();
			String sql = "SELECT * FROM COUNTRIES";
			result = stmt.executeQuery(sql);
			
			while (result.next()) {
				String COUNTRY_ID = result.getString("COUNTRY_ID");
				String COUNTRY_NAME = result.getString("COUNTRY_NAME");
				String REGION_ID = result.getString("REGION_ID");
				
				out.print("도시코드\t"+COUNTRY_ID);
				out.print("도시 명\t"+COUNTRY_NAME);
				out.print("지역코드\t"+REGION_ID+"<br>");
			}
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
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
