package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class NameFilter
 */
@WebFilter(urlPatterns={"/Tservlet"})
public class PasswordFilter implements Filter {
    /**
     * Default constructor. 
     */
    public PasswordFilter() {
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("PasswordFilter 过滤器销毁！");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("PasswordFilter 过滤器已经执行了！！");
		String passw=request.getParameter("passwd");
		HttpServletResponse res = (HttpServletResponse)response;
		if(!(passw==null || "".equals(passw))){
				chain.doFilter(request, response);
				/*res.sendRedirect("ServletDemo/loginSuccess.jsp");*/
		}else{
		res.sendRedirect("ServletDemo/NullPassword.html");
		}
		// pass the request along the filter chain
	}
		

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("PasswordFilter 过滤器启动！");
	}

}
