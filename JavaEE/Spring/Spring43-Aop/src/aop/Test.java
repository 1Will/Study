package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;
import service.UserService;

public class Test {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx=new  ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService =(UserService) ctx.getBean("service");
		User user =new User();
		user.setId(1);
		user.setName("张三");
		user.setPassword("123456");
		user.setEamil("123456@qq.com");
		userService.addNewUser(user);
	}
}
