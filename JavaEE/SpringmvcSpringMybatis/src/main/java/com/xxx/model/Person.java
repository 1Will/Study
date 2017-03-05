package com.xxx.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String sex;
	public Person(Integer id,String name, String sex) {
		super();
		this.id=id;
		this.name = name;
		this.sex = sex;
	}
}
