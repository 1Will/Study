package com.ssm.shopstore.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.shopstore.domain.User;
import com.ssm.shopstore.service.UserService;
@Controller
@RequestMapping(value = "/jsp")
public class UserController {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/addUser")
	public @ResponseBody User addUser(String phoneNum,String passwd){
		User user =new User();
		user.setPhone(phoneNum);
		user.setPasswd(passwd);
		userService.addUser(user);
		logger.info(phoneNum+"注册成功");
		return user;
	}
	
	
	@RequestMapping(value="/login")
	public @ResponseBody User userLogin(String phoneNum,String passwd){
		User user=userService.getUserByPeAndPw(phoneNum, passwd);
		if(user!=null){
			logger.info(phoneNum+"登录成功");
		}
		return user;
	}
}
