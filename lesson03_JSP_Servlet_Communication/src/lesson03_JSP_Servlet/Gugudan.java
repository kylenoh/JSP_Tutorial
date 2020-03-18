package lesson03_JSP_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Gugudan")
public class Gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet으로 접근하였습니다.");
		
		int dan = Integer.parseInt(request.getParameter("dan"));
		int s = Integer.parseInt(request.getParameter("start"));
		int e = Integer.parseInt(request.getParameter("end"));
		response.setCharacterEncoding("euc-kr");

		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.println("<head><meta charset='euc-kr'><title>구구단</title></head>");
		out.println("<body>");
		out.print("<table border='1'>");
		out.printf("<tr><td><h2>%d단</h2></td></tr>", dan);
		for (int i = s; i <= e; i++) {
			out.printf("<tr><td>%d x %d = %d</td></tr>", dan, i, dan * i);
		}
		out.print("</table>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost로 접근하였습니다.");
		doGet(request, response);
	}

}
