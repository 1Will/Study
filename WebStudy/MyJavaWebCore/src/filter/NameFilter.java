package filter;

import java.io.IOException;
import java.io.PrintWriter;

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
public class NameFilter implements Filter {
    /**
     * Default constructor. 
     */
    public NameFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("NameFilter 过滤器销毁！");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("NameFilter 过滤器已经执行了！！");
		PrintWriter out =response.getWriter();
		String uname=request.getParameter("username");
		HttpServletResponse res = (HttpServletResponse)response;
		if(!(uname==null || "".equals(uname))){
			chain.doFilter(request, response);
		}else{
		res.sendRedirect("ServletDemo/NullName.html");
		}
		// pass the request along the filter chain
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("NameFilter 过滤器启动！");
	}

}
