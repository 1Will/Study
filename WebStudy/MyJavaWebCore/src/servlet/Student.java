package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import Book.Students;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Students stu=new Students();
		ArrayList<Students> li=new ArrayList<Students>();
		for(int i=0;i<10;i++){
				String ne ="nu"+i+"1";
				String ce ="nu"+i+"2";
				String cs ="nu"+i+"3";
				String ge ="nu"+i+"4";
				stu.setName(request.getParameter(ne));
				stu.setCourse(request.getParameter(ce));
				stu.setClas(request.getParameter(cs));
				stu.setGrade(request.getParameter(ge));
				li.add(stu);
			}
		System.out.println(li.toString());
		request.getSession().setAttribute("table", li);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
