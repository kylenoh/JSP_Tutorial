package lesson09_JSP_ConnectionPool;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/SelectCountries")
public class SelectCountries extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		DataSource dataSource;

		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:/comp/env/jdbc/Oracle11g");
			con = dataSource.getConnection();
			String sql = "SELECT * FROM COUNTRIES";
			pstmt = con.prepareStatement(sql);
			result = pstmt.executeQuery(sql);
			
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
			if (pstmt != null) {
				try {
					pstmt.close();
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
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
