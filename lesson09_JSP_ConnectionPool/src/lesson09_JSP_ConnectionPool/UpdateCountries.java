package lesson09_JSP_ConnectionPool;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/UpdateCountries")
public class UpdateCountries extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Connection con = null;
		PreparedStatement pstmt = null;
		DataSource dataSource;

		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:/comp/env/jdbc/Oracle11g");
			con = dataSource.getConnection();
			String sql = "UPDATE COUNTRIES SET REGION_ID = ? WHERE COUNTRY_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 3);
			pstmt.setNString(2, "KR");
			int result = pstmt.executeUpdate();
			
			if (result==1) {
				out.print("UPDATE SUCCESS");
			}else {
				out.print("UPDATE FAIL");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (pstmt!=null) {
				try {
					pstmt.close();
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
