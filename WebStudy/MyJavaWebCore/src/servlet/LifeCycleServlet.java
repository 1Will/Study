package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.apache.catalina.connector.Request;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet(description = "life", urlPatterns = { "/servlet/LifeCycleServlet" },loadOnStartup=1)
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init()throws ServletException{
    	System.out.println("**1/Servlet初始化-->init()");
    }
    public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
    	System.out.println("**2、Servlet服务-->doGet()");
    }
    public void dopost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
    	this.doGet(req, resp);
    }
    public void destroy(){
    	System.out.println("**3、Servlet销毁-->destroy()");
    }

}
