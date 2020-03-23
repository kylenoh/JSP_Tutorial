package lesson10_JSP_DaoDto;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lesson10_JSP_DaoDto.dao.CountryDAO;
import lesson10_JSP_DaoDto.dto.CountryDTO;

@WebServlet("/Countries")
public class Countries extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CountryDAO countryDAO = new CountryDAO();
		ArrayList<CountryDTO>list = countryDAO.select();
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		for (int i = 0; i < list.size(); i++) {
			CountryDTO dto = list.get(i);
			String conId = dto.getCOUNTRY_ID();
			String conName = dto.getCOUNTRY_NAME();
			String regId = dto.getREGION_ID();
			
			out.print("COUNTRY_ID:\t" + conId);
			out.print("COUNTRY_NAME:\t" + conName);
			out.print("REGION_ID:\t" + regId+"<br>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
