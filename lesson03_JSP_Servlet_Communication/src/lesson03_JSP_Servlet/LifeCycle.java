package lesson03_JSP_Servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//	Service 와 동일합니다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("----------doGet()----------");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("----------postConstruct()----------");
	}
	//	Servlet 생성단계
	@Override
	public void init() {
		System.out.println("----------init()----------");
	}
	//	Servlet 종료단계
	@Override
	public void destroy() {
		System.out.println("----------destroy()----------");
	}
	@PreDestroy
	public void preDestory() {
		System.out.println("----------preDestory()----------");
	}
}
