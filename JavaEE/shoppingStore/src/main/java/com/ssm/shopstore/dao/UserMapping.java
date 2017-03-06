package com.ssm.shopstore.dao;


import org.apache.ibatis.annotations.Param;

import com.ssm.shopstore.domain.User;

public interface UserMapping {
	
	public void insert(User user);
	
	public User getByNaAndPwd(@Param("phone") String phone ,@Param("passwd") String passwd);
}
