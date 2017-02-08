package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ctx ;
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static void test1() {
		User user =new User();
		//user.setName("Teacher");
		user.setAddress("hefei");
		user.setMemo("This is first Spring project!");
		print(user);
	}
	
	private static void test2() {
		ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		User user =(User) ctx.getBean("users");
		print(user);
	}
	public static void main(String[] args) {
		test1();
		test2();
	}

}
