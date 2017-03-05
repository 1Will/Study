package com.xxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.dao.PersonMapper;
import com.xxx.model.Person;
import com.xxx.service.PersonService;

@Service("PersonServiceImpl")
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonMapper personMapper;
	
	@Override
	public List<Person> getAll() {
		return personMapper.getAll();
	}

	@Override
	public void delete(Integer id) {
		personMapper.delById(id);
	}

	@Override
	public void update(Person person) {
		personMapper.update(person);
	}

	@Override
	public Person getById(Integer id) {
		return personMapper.getById(id);
	}

	@Override
	public void insert(Person person) {
		personMapper.insert(person);
	}

	@Override
	public void updateName(Integer id, String name) {
		personMapper.updateName(id, name);
	}

	@Override
	public void updateSex(Integer id, String sex) {
		personMapper.updateSex(id, sex);
	}

}
