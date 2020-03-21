package lesson06_Cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("form_name");
		String password = request.getParameter("form_password");
		
		if (id.contentEquals("kyle")&&password.contentEquals("1234")) {
			Cookie cookie = new Cookie("id", id);
			cookie.setMaxAge(60);	//cookie 유효기간 1분 설정합니다.
			response.addCookie(cookie);
			response.sendRedirect("loginOK.jsp");
		}else {
			response.sendRedirect("login.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
