package lesson12_JSP_Character_Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(
			filterName = "Filter_annotation",
			urlPatterns = "/*",
			initParams = {@WebInitParam(name="enc", value="UTF-8")}
			)
public class Filter_annotation implements Filter {

	private FilterConfig filterConfig = null;
	
    public Filter_annotation() {
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String charset = filterConfig.getInitParameter("enc");
		System.out.println(charset);
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("Annotation필터:END");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.filterConfig = fConfig;
		System.out.println("Annotation필터:START");
	}

}
