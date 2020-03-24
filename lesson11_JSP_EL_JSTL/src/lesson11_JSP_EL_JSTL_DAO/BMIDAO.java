package lesson11_JSP_EL_JSTL_DAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lesson11_JSP_EL_JSTL_DTO.Person;

public class BMIDAO {
	private static final BMIDAO BMIDAO = new BMIDAO();

	private BMIDAO() {
		// TODO Auto-generated constructor stub
	}

	public static BMIDAO getCalculate() {
		return BMIDAO;
	}
	
	public void calculate(HttpServletRequest request, HttpServletResponse response) {
		
			String name = request.getParameter("form_name");
			double height = Double.parseDouble(request.getParameter("form_height"));
			double weight = Double.parseDouble(request.getParameter("form_weight"));
			double height2 = height / 100;
			double bmi = weight / (height2 * height2);

			String result = null;
			if (bmi >= 40) {
				result = "고도 비만";
			} else if (bmi >= 35) {
				result = "중등도 비만";
			} else if (bmi >= 30) {
				result = "경도 비만";
			} else if (bmi >= 25) {
				result = "정상";
			} else if (bmi >= 18.5) {
				result = "저 체중";
			}else {
				result = "사람인가요?";
			}
			
			Person person = new Person(name, height, weight, bmi, result);
			request.setAttribute("person", person);

	}
}
