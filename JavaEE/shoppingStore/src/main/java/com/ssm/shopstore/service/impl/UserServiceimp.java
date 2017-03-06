package com.ssm.shopstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.shopstore.dao.UserMapping;
import com.ssm.shopstore.domain.User;
import com.ssm.shopstore.service.UserService;

@Service("userService")
public class UserServiceimp implements UserService {
	@Autowired
	public UserMapping userMapping;
	
	@Override
	public void addUser(User user){
		userMapping.insert(user);
	}

	@Override
	public User getUserByPeAndPw(String phone, String passwd) {
		User user = userMapping.getByNaAndPwd(phone,passwd);
		return user;
	}
	
	
}