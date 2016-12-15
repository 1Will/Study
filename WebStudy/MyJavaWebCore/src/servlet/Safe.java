package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Safe
 */
@WebServlet("/servlet/Safe")
public class Safe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String name="";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Safe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {*/
	protected synchronized void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>线程安全</title></head>");
		out.println("<body>");
		String username =request.getParameter("username");
		name =new String(username.getBytes("iso-8859-1"),"utf-8");
		try{
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		out.println("<H3>您好，"+name+"!</H3>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
