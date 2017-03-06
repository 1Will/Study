package com.ssm.shopstore.vo;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class VoUser {
	private Integer id;
	private String name;
	private String phone;
	private String passwd;
	public VoUser() {
		super();
	}
	public VoUser(Integer id, String name, String phone, String passwd) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.passwd = passwd;
	}
	
}
