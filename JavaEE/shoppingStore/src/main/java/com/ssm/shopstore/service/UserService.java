package com.ssm.shopstore.service;

import com.ssm.shopstore.domain.User;

public interface UserService {

	void addUser(User user);
	
	User getUserByPeAndPw(String phone,String passwd);

}
