package lesson07_JSP_DivisionNum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DivisionNum")
public class DivisionNum extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String numbers = request.getParameter("numbers");
		String[] numberList = numbers.split(",");

		int[] intList = new int[numberList.length];

		for (int i = 0; i < intList.length; i++) {
			intList[i] = Integer.parseInt(numberList[i]);
		}

		// �ִ밪, �ּҰ� ã��
		int max = 0;
		int maxI = 0;
		int min = intList[0];
		int minI = 0;
		for (int i = 0; i < intList.length; i++) {
			if (intList[i] > max) {
				max = intList[i];
				maxI = i;
			}
			if (intList[i] < min) {
				min = intList[i];
				minI = i;
			}
		}

		response.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.println("<head><meta charset='euc-kr'><title>HC</title></head>");
		out.println("<body>");
		out.printf("<h1>숫자들 : %s</h1>", numbers);
		out.printf("<h2>최대값 : %d</h2>", intList[maxI]);
		out.printf("<h2>최소값: %d</h2>", intList[minI]);
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response); 
	}

}
