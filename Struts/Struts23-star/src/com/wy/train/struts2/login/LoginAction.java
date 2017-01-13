package com.wy.train.struts2.login;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class LoginAction {
private String username;
private String password;

public String execute() throws Exception{
	if(this.getUsername().equals("admin")&&this.getPassword().equals("admin")){
		return "success";
	}
	return "error";
}
}
