package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Submit
 */
@WebServlet("/servlet/Submit")
public class Submit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Submit() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");*/
		String uname = (String) request.getParameter("name");
		String pass = (String) request.getParameter("password");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		/*ServletContext context = getServletConfig().getServletContext();*/
		if (!(uname == null || pass == null || "".equals(uname) || "".equals(pass))) {
			if ("李四".equals(uname) && "123".equals(pass)) {
				/* response.setHeader("refresh", "0;URL=JSP/Index2.jsp"); */
				session.setAttribute("user", uname);
				/*context.getRequestDispatcher("/JSP/Index2.jsp").forward(request, response);*/
				response.sendRedirect(request.getContextPath()+"/JSP/Index2.jsp");
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
