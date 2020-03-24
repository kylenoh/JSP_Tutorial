package lesson11_JSP_EL_JSTL_DAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticDAO {
	public static void calculate(HttpServletRequest request, HttpServletResponse response) {
		int xValue = Integer.parseInt(request.getParameter("xValue"));
		int yValue = Integer.parseInt(request.getParameter("yValue"));

		request.setAttribute("plus", xValue+yValue);
		request.setAttribute("minus", xValue-yValue);
		request.setAttribute("multiply", xValue*yValue);
		request.setAttribute("division", xValue/yValue);
	}
}
