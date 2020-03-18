package lesson03_JSP_Servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 실행");
	
		String name = request.getParameter("form_name");
		String password = request.getParameter("form_password");
		String gender = request.getParameter("form_gender");
		String hobbys[] = request.getParameterValues("form_hobby");
		String location = request.getParameter("form_location");
		
		System.out.println("이름\t"+name);
		System.out.println("암호\t"+password);
		System.out.println("성별\t"+gender);
		System.out.println("취미\t"+Arrays.toString(hobbys));
		System.out.println("거주지\t"+location);
		
		Enumeration<String>names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String str = (String) names.nextElement();
			System.out.println("태그명\t"+str);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	1.	Login Form을 클릭하면 doPost가 실행 됩니다.
		System.out.println("doPost 실행");
		//	2.	doGet으로 이동 합니다.
		doGet(request, response);
	}

}
