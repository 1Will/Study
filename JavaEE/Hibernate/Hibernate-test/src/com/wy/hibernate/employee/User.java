package com.wy.hibernate.employee;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
	private Long id;
	String name;
	String job;
	float workTime;

	public User() {
	}

	public User(Long id, String name, String job, float workTime) {
		super();
		this.id=id;
		this.name = name;
		this.job = job;
		this.workTime = workTime;
	}
	
	public String toString(){
		return "Users[id ="+id+"name="+name+"job ="+job+",workTime="+workTime+"]";
	}
	
}
