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
		System.out.println("doGet ����");
	
		String name = request.getParameter("form_name");
		String password = request.getParameter("form_password");
		String gender = request.getParameter("form_gender");
		String hobbys[] = request.getParameterValues("form_hobby");
		String location = request.getParameter("form_location");
		
		System.out.println("�̸�\t"+name);
		System.out.println("��ȣ\t"+password);
		System.out.println("����\t"+gender);
		System.out.println("���\t"+Arrays.toString(hobbys));
		System.out.println("������\t"+location);
		
		Enumeration<String>names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String str = (String) names.nextElement();
			System.out.println("�±׸�\t"+str);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	1.	Login Form�� Ŭ���ϸ� doPost�� ���� �˴ϴ�.
		System.out.println("doPost ����");
		//	2.	doGet���� �̵� �մϴ�.
		doGet(request, response);
	}

}
