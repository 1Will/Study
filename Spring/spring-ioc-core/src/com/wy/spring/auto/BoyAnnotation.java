package com.wy.spring.auto;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/*@Component("boyAnnotation")
@Autowired
@Resource
@Repository
@Service
@Controller
@Scope("session") bean的作用域
	singleton    单例，共享bean
	prototype    注入新的bean
	request      http  request
	session      http session
	global session portlet web  有效 全局session
@author win	
*/
@Component("boyAnnotation")
public class BoyAnnotation {
	private static Logger logger =Logger.getLogger(BoyAnnotation.class);
	//@Autowired
	private UsaGirlFriend usaGirlFriend;
	private static ApplicationContext ctx;
	public UsaGirlFriend getUsaGirlFriend(){
		return usaGirlFriend;
	}
	
	@Resource(type=UsaGirlFriend.class)   //JDK中的注解
	//@Resource(name="usaGirlFriend")     //JDK中的注解
	public void setUsaGirlFriend(UsaGirlFriend usaGirlFriend){
		this.usaGirlFriend=usaGirlFriend;
	}
	public static void main(String args[]) {
		ctx=new ClassPathXmlApplicationContext("applicationContext-auto.xml");
		BoyAnnotation boy =(BoyAnnotation) ctx.getBean("boyAnnotation");
		logger.info(boy.usaGirlFriend.speak());
	}
}
