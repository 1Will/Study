package com.wy.spring.type;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class User {
	private String username;
	public String toString(){
		return this.username;
	}
}
