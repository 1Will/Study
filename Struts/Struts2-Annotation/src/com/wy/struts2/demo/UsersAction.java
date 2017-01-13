package com.wy.struts2.demo;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;


@Setter@Getter
public class UsersAction extends ActionSupport{

	private static final long serialVersionUID = 409254021890273331L;
	private String username;
	private String password;
	/*
	 * value的值是path，页面form的action的值对应
	 * @Result返回结果
	 * name 跳转地址别名
	 * location具体跳转地址
	 * */
	@Action(value="/users",results={@Result(name="success",location="/results/success.jsp")})
	public String execute(){
		return SUCCESS;
	}
	
}
