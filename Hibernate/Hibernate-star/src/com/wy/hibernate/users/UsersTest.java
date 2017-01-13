package com.wy.hibernate.users;


import java.util.List;

import org.apache.catalina.User;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UsersTest {
	
	private static Logger logger=Logger.getLogger(UsersTest.class);
	private Session session=null;
	private SessionFactory sessionFactory =null;
	
	/*
	 * 获取session
	 * @return
	 * */
	public Session getSession() {
		//读取配置文件，创建sessionFactory对象
		sessionFactory=new Configuration().configure().buildSessionFactory();
		//创建session对象
		session =sessionFactory.openSession();
		return session;
	}
	
	/*
	 * 关闭session
	 * */
	
	public void closeSession() {
		if (session!=null) {
			session.close();
		}
		if (sessionFactory!=null) {
			sessionFactory.close();
		}
	}
	
	/*
	 * 插入数据
	 * 
	 * @param users
	 * @return
	 * */
	
	public Long insert(Users users){
		session=getSession();
		Transaction transaction =session.beginTransaction();
		Long id =(Long) session.save(users);//保存表
		transaction.commit();
		closeSession();
		return id;
	}
	
	public void update(Users users){
		session=getSession();
		Transaction transaction =session.beginTransaction();
		session.update(users);
		transaction.commit();
		closeSession();
	}
	
	public void delete(Users users){
		session=getSession();
		Transaction transaction =session.beginTransaction();
		session.delete(users);
		transaction.commit();
		closeSession();
	}
	
	public User getUserById(Long id){
		session =getSession();
		User user =(User) session.get(User.class, id);
		closeSession();
		return user;
	}
	
	public List<Users> getUsersList() {
		session=getSession();
		
		//List<User> uList =(List<User>)session.createQuery("from Users").list();  旧版方法
		
		List<Users> uList =(List<Users>)session.createQuery("from Users").getResultList();
		closeSession();
		return uList;
	}
	
	public static void main(String[] args) {
		UsersTest test =new  UsersTest();
		//Long userId =test.insert(new Users(null,"jack1","jack1"));
		//logger.info(userId);
		//logger.info(test.getUserById(userId));
		//test.update(new Users(6L,"tom11","tom11"));
		
		Users users =new Users();
		
		//users.setId(6L);
		//test.delete(users);
		//logger.info(test.getUserById(5L));
		
		List<Users> uList =test.getUsersList();
		for(Users users1 : uList){
			logger.info(users1);
		}

	}

}
