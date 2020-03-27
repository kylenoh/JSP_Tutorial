package lesson14_JSP_Board_MVC2_Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lesson14_JSP_Board_MVC2_DAO.Board_DAO;

@WebServlet("/writeController")
public class writeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		전달받은 값의 인코딩 타입을 세팅합니다.
		request.setCharacterEncoding("EUC-KR");
		
//		데이터 베이스 접근을 담당하는 DAO에 insert 를 호출합니다. 
		Board_DAO.insert(request, response);
		
//		request에 값을 담아 View(list.jsp)페이지로 이동 합니다.
		request.getRequestDispatcher("Board/list.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		POST로 데이터가 올 경우, doGet에서 처리합니다.
		doGet(request, response);
	}

}
