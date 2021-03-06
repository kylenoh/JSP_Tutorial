package lesson14_JSP_Board_MVC2_Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lesson14_JSP_Board_MVC2_DAO.Board_DAO;

@WebServlet("/listController")
public class listController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public listController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Board_DAO.select(request, response);
		request.getRequestDispatcher("Board/list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
