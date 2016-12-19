package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class HttpSessionBindingListener
 *
 */
//@WebListener
public class HttpSessionBindingListener implements javax.servlet.http.HttpSessionBindingListener {

	private String name;
	public HttpSessionBindingListener(String name) {
	this.setName(name);
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	
    /**
     * Default constructor. 
     */
    public HttpSessionBindingListener() {
        // TODO Auto-generated constructor stub
    	
    }

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent paramHttpSessionBindingEvent)  { 
         // TODO Auto-generated method stub
    	System.out.println("在Session中保存HttpSessionBindingListener对象（name="+this.getName()+"), session id="+paramHttpSessionBindingEvent.getSession().getId());
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent paramHttpSessionBindingEvent)  { 
         // TODO Auto-generated method stub
    	System.out.println("在Session中移除HttpSessionBindingListener对象（name="+this.getName()+"), session id="+paramHttpSessionBindingEvent.getSession().getId());
    }
	
}
