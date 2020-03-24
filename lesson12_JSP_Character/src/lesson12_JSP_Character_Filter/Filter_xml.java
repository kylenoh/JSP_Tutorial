package lesson12_JSP_Character_Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter_xml implements Filter {

    public Filter_xml() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		System.out.println("WEB.XML필터:END");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("RequestURL : "+request.getRemoteHost());
        
        chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		String filterParam = fConfig.getInitParameter("filterParam");
		System.out.println(filterParam);
		System.out.println("WEB.XML필터:START");
	}

}
