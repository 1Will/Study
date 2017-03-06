package com.ssm.shopstore.domain;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class User {
	private Integer id;
	private String name;
	private String phone;
	private String passwd;
	public User() {
		super();
	}
	public User(Integer id, String name, String phone, String passwd) {
		super();
		this.id=id;
		this.name = name;
		this.phone = phone;
		this.passwd = passwd;
	}
	
}
