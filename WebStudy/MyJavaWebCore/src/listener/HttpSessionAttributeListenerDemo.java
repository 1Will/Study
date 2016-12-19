package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class HttpSessionAttributeListenerDemo
 *
 */
//@WebListener
public class HttpSessionAttributeListenerDemo implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public HttpSessionAttributeListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
    	System.out.println("Session添加属性！-->属性名："+arg0.getName()+"属性值："+arg0.getValue());
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
    	System.out.println("Session删除属性！-->属性名："+arg0.getName()+"属性值："+arg0.getValue());
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("Session替换属性！-->属性名："+arg0.getName()+"属性值："+arg0.getValue());
    }
	
}
