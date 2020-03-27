package lesson14_JSP_Board_MVC2_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import lesson14_JSP_Board_MVC2_DTO.Board_DTO;


public class Board_DAO {

	public static void select(HttpServletRequest request, HttpServletResponse response) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		try {
			Context context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:/comp/env/jdbc/Oracle11g");
			
			con = dataSource.getConnection();
			String sql = "SELECT * FROM BOARD ORDER BY BOARD_IDX";
			pstmt = con.prepareStatement(sql);
			result = pstmt.executeQuery(sql);
			
			ArrayList<Board_DTO> board = new ArrayList<>();
			Board_DTO BoardDTO;
			
			while (result.next()) {
				BoardDTO = new Board_DTO();
				BoardDTO.setBoard_idx(result.getInt("BOARD_IDX"));
				BoardDTO.setBoard_title(result.getString("BOARD_TITLE"));
				BoardDTO.setBoard_writer(result.getString("BOARD_WRITER"));
				BoardDTO.setBoard_writedate(result.getString("BOARD_WRITEDATE"));
				BoardDTO.setBoard_count(result.getString("BOARD_COUNT"));
				board.add(BoardDTO);
			}
			
			request.setAttribute("BOARD", board);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {pstmt.close();} catch (SQLException e) {}}
			if (con != null) {try {con.close();} catch (SQLException e) {}}
			if (result != null) {try {result.close();} catch (SQLException e) {}}
		}

	}
	
	public static void insert(HttpServletRequest request, HttpServletResponse response) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
//			ConnectionPool 을 만듭니다. 
			String board_title = request.getParameter("board_title"); 
			String board_writer  = request.getParameter("board_writer"); 
			String board_content = request.getParameter("board_content");
			
			Context context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:/comp/env/jdbc/Oracle11g");
			con = dataSource.getConnection();
			String sql = "INSERT INTO BOARD VALUES (BOARD_SEQ.NEXTVAL, ?, ?, SYSDATE, 20, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board_title);
			pstmt.setString(2, board_writer);
			pstmt.setString(3, board_content);
			
			if (pstmt.executeUpdate() == 1) {
				request.setAttribute("result", "INSERT SUCCESS");
			}else {
				request.setAttribute("result", "INSERT FAIL");
			}	
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if (con != null) {try {con.close();} catch (SQLException e) {e.printStackTrace();}}
		}

	}
	
	public void update(HttpServletRequest request, HttpServletResponse response) {
		
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response) {
		
	}
}
