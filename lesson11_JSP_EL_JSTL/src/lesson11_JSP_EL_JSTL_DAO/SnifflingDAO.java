package lesson11_JSP_EL_JSTL_DAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SnifflingDAO {
	public static void judge(HttpServletRequest request, HttpServletResponse response) {
		int number = Integer.parseInt(request.getParameter("number"));
		if (number % 2 == 0) {
			request.setAttribute("result", "짝수");
		} else {
			request.setAttribute("result", "홀수");
		}
	}
}
