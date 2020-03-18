package lesson03_JSP_InputOutput;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// ���ͳ� �ּҿ��� �ѱ۾��� �ȵ˴ϴ�.
	// => URL���ڵ�(�� -> %2A)���� �ٲ㼭 �־�� ��
	// => GET��� ��û�� �Ķ���� �ѱ�ó���� ��Ĺ ���� ��������

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr"); // Ŭ���̾�Ʈ�� ��û�Ҷ�
		response.setCharacterEncoding("euc-kr");// �������� ���� ������

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String n = request.getParameter("name");
		String g = request.getParameter("gender");
		String a = request.getParameter("addr");
		String a2 = request.getParameter("addr2");
		
		// checkbox
		String[] hobby = request.getParameterValues("hobby");
		
		// textarea���� ����ģ�� : \n
		// \n => <br>�� �ٲ�� ���������󿡼� �ٹٲ���
		String introduce = request.getParameter("introduce");
		introduce = introduce.replace("\n", "<br>");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");		
		out.println("<head><meta charset='euc-kr'><title>HC</title></head>");
		out.println("<body>");		
		out.printf("ID : %s<p>", id);		
		out.printf("PW : %s<p>", pw);		
		out.printf("�̸� : %s<p>", n);		
		out.printf("���� : %s<p>", g);		
		out.printf("�ּ� : %s<p>", a);		
		out.printf("���� : %s<p>", a2);
		if(hobby != null) {
			out.print("��� : ");
			for (String h : hobby) {
				out.print(h + " ");
			}
			out.println("<br>");
		}
		out.printf("�ڱ�Ұ� : %s<p>", introduce);
		out.println("</body>");
		out.println("</html>");
	}

}
