package com.xxx.controller.valueobject;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PersonVo {
	/**
	 * 
	 */
	private Integer id;
	private String name;
	private String sex;
	public PersonVo(Integer id, String name, String sex) {
		super();
		this.id=id;
		this.name = name;
		this.sex = sex;
	}
	
}
