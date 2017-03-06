package com.ssm.shopstore.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Alcohol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7145471036011561455L;
	
	private Integer id;
	private String type;
	private AllType allType;
	
}
