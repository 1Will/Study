package com.xxx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xxx.model.Person;

/**
 * 影院店铺信息映射关系 数据实例化接口
 * 
 * @author author
 * @date 2016/02/16
 */
public interface PersonMapper {

	
	/**
	 * 查询所有
	 * */
	
	public List<Person> getAll();
	
	public Person getById(@Param("id") Integer id);
	
	public void delById(@Param("id") Integer id);
	
	public void update(Person person);
	
	public void updateName(@Param("id") Integer id,@Param("name") String name);
	
	public void updateSex(@Param("id") Integer id,@Param("sex") String sex);

	public void insert(Person person);

}
