package com.xxx.service;

import java.util.List;

import com.xxx.model.Person;

/**
 * 影院店铺信息接口服务
 * 
 * @author author
 * @date 2016/02/16
 */
public interface PersonService {

	/**
	 * 根据店铺的编码和密码查询店铺信息
	 * @param shopNo 店铺编码
	 * @param password 密码
	 * @return 店铺信息
	 * @throws Exception 
	 */

	public List<Person> getAll();

	void delete(Integer id);
	
	void update(Person person);

	Person getById(Integer id);
	
	void insert(Person person);
	
	void updateName(Integer id,String name);
	
	void updateSex(Integer id,String sex);
	
}
