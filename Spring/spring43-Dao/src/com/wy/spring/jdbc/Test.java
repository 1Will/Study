package com.wy.spring.jdbc;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.wy.spring.jdbc.User;

public class Test {
	private static final Logger LOGGER =Logger.getLogger(Test.class);
	private JdbcTemplate jdbcTemplate;
	private ApplicationContext ctx;
	
	public void init() {
		ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		this.jdbcTemplate =ctx.getBean("jdbcTemplate",JdbcTemplate.class);
	}
	
	public int insert(User user){
		String sql = "insert into users (name,pass) values('"+user.getName()+"','"+user.getPass()+"')";
		int count =this.jdbcTemplate.update(sql);
		return count;
	}
	
	public int update(User user){
		String sql = "update users set name=?,pass=? where id=?";
		int count =this.jdbcTemplate.update(sql,user.getName(),user.getPass(),user.getId());
		return count;
	}
	
	public int delete(Long id){
		String sql = "delete from users where id=?";
		int count =this.jdbcTemplate.update(sql,id);
		return count;
	}
	
	public User getOne(Long id){
		String sql = "select * from users where id="+id;
		User user =this.jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class));
		return user;
	}
	
	public Long getCount(String name){
		String sql = "select count(*) from users where name='"+name+"'";
		//return this.jdbcTemplate.queryForLong(sql, name);  //4.3.3 已遗弃
		return this.jdbcTemplate.queryForObject(sql, Long.class);
	}
	
	public List<User> getUsersList(){
		String sql ="select * from users";
		List<User> userList = this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class) );
		return userList;
	}
	
	public List<User> getUsersList(User user){
		String sql ="select * from users where 1=1 and name=? and pass = ?";
		List<User> userlist = this.jdbcTemplate.query(sql, new Object[]{user.getName(),user.getPass()},new BeanPropertyRowMapper<User>(User.class));
		return userlist;
	}
	
	
	

	public static void main(String[] args) {
		Test test =new Test();
		test.init();
		
		User user =new User();
		//user.setId(4L);
		user.setName("wangwu");
		user.setPass("66677788");
		//LOGGER.info(test.insert(user));
		//LOGGER.info(test.update(user));
		//User user =test.getOne(1L);
		LOGGER.info(user);
		
		//List<User> userslist =test.getUsersList();
		//LOGGER.info(userslist);
		
		//List<User> userslist =test.getUsersList(user);
		//LOGGER.info(userslist);
		
		//LOGGER.info(test.getCount("zhangsan"));
		/*List<User> userslist =test.getUsersList(user);
		LOGGER.info(userslist.size());
		for(User user2 : userslist){
			LOGGER.info(user2);
		}*/
		
		//LOGGER.info(test.delete(5L));
	}

}
