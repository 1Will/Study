package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mysql.ConnectSQL;

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
		String uname = (String) request.getParameter("name");
		String pass = (String) request.getParameter("password");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		ConnectSQL csql = new ConnectSQL();
		ResultSet pw = null;
		if (!(uname == null || pass == null || "".equals(uname) || "".equals(pass))) {
			try {
				pw = csql.getResult("select passwd from consumer where name = '" + uname + "'");
				if (pw.next()) {
					if (pw.getString("passwd").equals(pass)) {
						session.setAttribute("user", uname);
						session.setMaxInactiveInterval(600);
						response.sendRedirect(request.getContextPath() + "/JSP/Index2.jsp");
					} else {
						out.print("<script language='javascript'>alert('密码错误！！！')</script>");
						response.setHeader("refresh", "0;URL=../Login.jsp");
					}
				} else {
					out.print("<script language='javascript'>alert('用户不存在！！！')</script>");
					response.setHeader("refresh", "0;URL=../Login.jsp");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			out.print("<script language='javascript'>alert('用户名或密码不能为空！！！')</script>");
			response.setHeader("refresh", "0;URL=../Login.jsp");
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
