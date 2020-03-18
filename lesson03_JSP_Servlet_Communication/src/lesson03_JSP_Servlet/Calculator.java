package lesson03_JSP_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }
//    GET���� ���ٽ� URL���� �ѱ��� ����� �� �����ϴ�.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aa = request.getParameter("a");
		int a = Integer.parseInt(aa);
		int b = Integer.parseInt(request.getParameter("b"));
		int c = a + b;		int d = a - b;
		int e = a * b;		int f = a / b;
		
		// �����Ҷ� ������ ����� ���ڵ� ��ļ����� �ݴϴ�.
		response.setCharacterEncoding("euc-kr");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.println("<head><title>���</title></head>");
		out.println("<body>");
		out.println("<h2>�����</h2>");
		out.printf("%d + %d = %d<br>", a, b, c);
		out.printf("%d - %d = %d<br>", a, b, d);
		out.printf("%d * %d = %d<br>", a, b, e);
		out.printf("%d / %d = %d<br>", a, b, f);
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
