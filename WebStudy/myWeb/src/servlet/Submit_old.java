package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.glass.ui.Application;

@WebServlet("/servlet/Submit2")
public class Submit_old extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Submit_old() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * response.setContentType("text/html;charset=UTF-8");
		 * request.setCharacterEncoding("UTF-8");
		 */
		String uname = (String) request.getParameter("name");
		String pass = (String) request.getParameter("password");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		/* ServletContext context = getServletConfig().getServletContext(); */
		if (!(uname == null || pass == null || "".equals(uname) || "".equals(pass))) {
			if ("李四".equals(uname) && "123".equals(pass) || "张三".equals(uname) && "123".equals(pass)
					|| "王五".equals(uname) && "123".equals(pass)) {
				/* response.setHeader("refresh", "0;URL=JSP/Index2.jsp"); */
				/*
				 * context.getRequestDispatcher("/JSP/Index2.jsp").forward(
				 * request, response);
				 */
				session.setAttribute("user", uname);
				session.setMaxInactiveInterval(600);
				response.sendRedirect(request.getContextPath() + "/JSP/Index2.jsp");
			} else {
				out.print("<script language='javascript'>alert('用户名或密码错误！！！')</script>");
				response.setHeader("refresh", "0;URL=../Index.jsp");
				// response.sendRedirect(request.getContextPath()+"/Index.jsp");
			}
		} else {
			out.print("<script language='javascript'>alert('用户名或密码不能为空！！！')</script>");
			response.setHeader("refresh", "0;URL=../Index.jsp");
			// response.sendRedirect(request.getContextPath()+"/Index.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
