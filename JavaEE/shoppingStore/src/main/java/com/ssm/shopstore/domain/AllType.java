package com.ssm.shopstore.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class AllType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String type;

}
