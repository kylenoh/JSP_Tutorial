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

	// 인터넷 주소에는 한글쓰면 안됩니다.
	// => URL인코딩(ㅋ -> %2A)으로 바꿔서 넣어야 함
	// => GET방식 요청의 파라메터 한글처리는 톰캣 설정 변경으로

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr"); // 클라이언트가 요청할때
		response.setCharacterEncoding("euc-kr");// 서버에서 응답 보낼때

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String n = request.getParameter("name");
		String g = request.getParameter("gender");
		String a = request.getParameter("addr");
		String a2 = request.getParameter("addr2");
		
		// checkbox
		String[] hobby = request.getParameterValues("hobby");
		
		// textarea에서 엔터친거 : \n
		// \n => <br>로 바꿔야 웹페이지상에서 줄바꿈이
		String introduce = request.getParameter("introduce");
		introduce = introduce.replace("\n", "<br>");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");		
		out.println("<head><meta charset='euc-kr'><title>HC</title></head>");
		out.println("<body>");		
		out.printf("ID : %s<p>", id);		
		out.printf("PW : %s<p>", pw);		
		out.printf("이름 : %s<p>", n);		
		out.printf("성별 : %s<p>", g);		
		out.printf("주소 : %s<p>", a);		
		out.printf("고향 : %s<p>", a2);
		if(hobby != null) {
			out.print("취미 : ");
			for (String h : hobby) {
				out.print(h + " ");
			}
			out.println("<br>");
		}
		out.printf("자기소개 : %s<p>", introduce);
		out.println("</body>");
		out.println("</html>");
	}

}
