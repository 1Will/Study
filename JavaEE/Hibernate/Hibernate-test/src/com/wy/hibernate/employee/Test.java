package com.wy.hibernate.employee;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wy.hibernate.employee.User;


public class Test {
	
	private static Logger logger=Logger.getLogger(Test.class);
	private Session session=null;
	private SessionFactory sessionFactory =null;
	
	public Session getSession() {
		//读取配置文件，创建sessionFactory对象
		sessionFactory=new Configuration().configure().buildSessionFactory();
		//创建session对象
		session =sessionFactory.openSession();
		return session;
	}
	
	public void closeSession() {
		if (session!=null) {
			session.close();
		}
		if (sessionFactory!=null) {
			sessionFactory.close();
		}
	}
	
	public User getUserById(Long id){
		session =getSession();
		User user =(User) session.get(User.class, id);
		closeSession();
		return user;
	}
	
	public List<User> getUsersList() {
		session=getSession();
		
		//List<User> uList =(List<User>)session.createQuery("from Users").list();  旧版方法
		
		List<User> uList =(List<User>)session.createQuery("from User").getResultList();
		closeSession();
		return uList;
	}

	public void insert(User users){
		session=getSession();
		Transaction transaction =session.beginTransaction();
		//Long id =(Long) session.save(users);//保存表
		session.save(users);//保存表
		transaction.commit();
		closeSession();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test =new Test();
		User user=new User(null,"jack1","小工",55.3f);
		test.insert(user);
		//logger.info(userId);
		//logger.info(test.getUserById(userId));
		
	}

}
