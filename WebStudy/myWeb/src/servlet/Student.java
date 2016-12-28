package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Students;

/**
 * Servlet implementation class Student
 */
@WebServlet("/servlet/Student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		ArrayList<Students> ta = (ArrayList<Students>) request.getSession().getAttribute("table");
		ArrayList<Integer> id = (ArrayList<Integer>) request.getSession().getAttribute("ids");

		String[] vb = request.getParameterValues("box");

		/* 删除进入 */
		if (vb != null) {
			for (int j = vb.length - 1; j >= 0; j--) {
				int b = Integer.parseInt(vb[j]);
				ta.remove(ta.get(b));
			}
			response.sendRedirect("../HTML/works/Exam/Table.jsp");
			return;
		}

		/* update进入此处，删除选中表格 */
		if (id != null) {
			for (int i = id.size() - 1; i >= 0; i--) {
				int a = id.get(i);
				ta.remove(ta.get(a));
			}
			id.clear();
			request.getSession().setAttribute("ids", id);
		}

		/* 刚进入页面，初始化ta */
		if (ta == null) {
			ta = new ArrayList<Students>();
		}

		/* 获取内容，并存入session */
		for (int i = 0; i < 10; i++) {
			Students stu = new Students();
			String ne = "nu" + i + "1";
			String cs = "nu" + i + "2";
			String ce = "nu" + i + "3";
			String ge = "nu" + i + "4";
			if (!(request.getParameter(ne) == null || "".equals(request.getParameter(ne)))) {
				stu.setName(request.getParameter(ne));
				stu.setClas(request.getParameter(cs));
				stu.setCourse(request.getParameter(ce));
				stu.setGrade(request.getParameter(ge));
				ta.add(stu);
			}
		}

		request.getSession().setAttribute("table", ta);
		out.print("<script language=javascript>window.close();</script>");
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
