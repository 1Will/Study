package listener;

import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Application Lifecycle Listener implementation class Online_Listener
 *
 */
@WebListener
public class Online_Listener implements  HttpSessionListener,HttpSessionAttributeListener,ServletContextListener {
	ServletContext app = null;

	public Online_Listener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("监听器开始工作！");
		app = arg0.getServletContext();
		app.setAttribute("online", new TreeSet());
	}
	 

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("开始添加");
		Set all = (Set) this.app.getAttribute("online");
		String user = (String) arg0.getValue();
		all.add(user);
		app.setAttribute("online", all);
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		Set all = (Set) this.app.getAttribute("online");
		String user = (String) arg0.getValue();
		all.remove(user);
		app.setAttribute("online", all);
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		Set all = (Set) this.app.getAttribute("online");
		all.remove(arg0.getSession().getAttribute("name"));
		this.app.setAttribute("online", all);
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
