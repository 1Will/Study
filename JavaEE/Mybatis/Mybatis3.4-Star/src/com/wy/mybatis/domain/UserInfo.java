package com.wy.mybatis.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserInfo {
	private Integer id;
	private String username;
	private String password;
	
	public String toString() {
		return "[ id =".concat(this.id + ",username = ").concat(this.username +", password = ").concat(this.password +" ]");
	}
}
