package lesson10_JSP_DaoDto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import lesson10_JSP_DaoDto.dto.CountryDTO;

public class CountryDAO {

	public ArrayList<CountryDTO> select() {
		
		ArrayList<CountryDTO>list = new ArrayList<CountryDTO>();
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
				
				CountryDTO countryDTO = new CountryDTO(COUNTRY_ID, COUNTRY_NAME, REGION_ID);
				list.add(countryDTO);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				result.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public boolean insert() {
		Connection con = null;
		PreparedStatement pstmt = null;
		DataSource dataSource;
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:/comp/env/jdbc/Oracle11g");
			con = dataSource.getConnection();
			String sql = "INSERT INTO COUNTRIES (COUNTRY_ID,COUNTRY_NAME,REGION_ID)VALUES(?,?,?)";
			pstmt= con.prepareStatement(sql);
			pstmt. setString(1, "KR");
			pstmt.setString(2, "KOREA");
			pstmt.setInt(3, 2);
			int result = pstmt.executeUpdate();

			if (result==1) {
				System.out.println("INSERT SUCCESS");
				return true;
			}else {
				System.out.println("INSERT FAIL");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			if (pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public boolean update() {
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
				System.out.println("UPDATE SUCCESS");
				return true;
			}else {
				System.out.println("UPDATE FAIL");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			if (pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public boolean delete() {
		PreparedStatement pstmt = null;
		Connection con = null;
		DataSource dataSource;
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:/comp/env/jdbc/Oracle11g");
			con = dataSource.getConnection();
			String sql = "DELETE FROM COUNTRIES WHERE COUNTRY_ID = ?";
			pstmt= con.prepareStatement(sql);
			pstmt.setString(1, "KR");
			int result = pstmt.executeUpdate();
			
			if (result==1) {
				System.out.println("DELETE SUCCESS");
				return true;
			}else {
				System.out.println("DELETE FAIL");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
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
}
