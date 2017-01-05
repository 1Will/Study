package com.wy.spring.set;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsaGirlFriend implements GirlFriend {
	private String language;

	@Override
	public String speak() {
		return language;
	}
}
