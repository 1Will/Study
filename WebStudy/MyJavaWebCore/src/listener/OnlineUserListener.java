package listener;

import java.io.UnsupportedEncodingException;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


/**
 * Application Lifecycle Listener implementation class OnlineUserListener
 *
 */
@WebListener
public class OnlineUserListener implements HttpSessionAttributeListener, HttpSessionListener,ServletContextListener{
	private ServletContext app = null ;
    /**
     * Default constructor. 
     */
    public OnlineUserListener() {
        // TODO Auto-generated constructor stub
    }
    

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    


    public void contextInitialized(ServletContextEvent arg0){
    	System.out.println("Online初始化");
    	this.app=arg0.getServletContext();
    	this.app.setAttribute("online", new TreeSet());
    }
	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0){ 
    	System.out.println("Online加元素");
    	String value = (String) arg0.getValue();
    	try {
			value=new String(value.getBytes("ISO-8859-1") ,"UTF-8" );
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	Set all =(Set)this.app.getAttribute("online") ;
    	all.add(value);
    	this.app.setAttribute("online", all);
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	Set all =(Set)this.app.getAttribute("online");
    	all.remove(arg0.getValue());
    	this.app.setAttribute("online", all);
    }

    /**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	Set all =(Set)this.app.getAttribute("online");
    	all.remove(arg0.getSession().getAttribute("namee"));
    	this.app.setAttribute("online", all);
    }
    
	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	// TODO Auto-generated method stub
    }


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
