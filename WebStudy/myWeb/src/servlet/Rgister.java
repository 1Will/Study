package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mysql.ConnectSQL;

/**
 * Servlet implementation class Rgister
 */
@WebServlet("/servlet/Rgister")
public class Rgister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Rgister() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String na = request.getParameter("name");
		String pw = request.getParameter("passwd");
		String pw2 = request.getParameter("passwd2");
		PrintWriter out = response.getWriter();
		if (!(na == null || "".equals(na) || pw == null || "".equals(pw) || pw2 == null || "".equals(pw2))) {
			if (pw.equals(pw2)) {
				ResultSet name = null;
				try {
					ConnectSQL csql = new ConnectSQL();
					name = csql.getResult("select name from consumer where name = '" + na + "'");
					if (!name.next()) {
						try {
							csql.execute("use myweb");
							csql.execute("insert into consumer(name,passwd) values ('" + na + "','" + pw + "')");
							out.print("<script language='javascript'>alert('注册成功，前往登录！！')</script>");
							response.setHeader("refresh", "0;URL=../Login.jsp");
						} catch (Exception e) {
							e.printStackTrace();
						}
					} else {
						out.print("<script language='javascript'>alert('用户已存在，请重新输入！！')</script>");
						response.setHeader("refresh", "0;URL=../Register.jsp");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				out.print("<script language='javascript'>alert('两次密码不一致！！！')</script>");
				response.setHeader("refresh", "0;URL=../Register.jsp");
			}
		} else {
			out.print("<script language='javascript'>alert('用户名或密码不能为空！！！')</script>");
			response.setHeader("refresh", "0;URL=../Register.jsp");
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
