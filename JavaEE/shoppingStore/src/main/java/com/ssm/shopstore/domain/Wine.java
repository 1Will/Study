package com.ssm.shopstore.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Wine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2602426076484644195L;
	
	private Integer id;
	private String name;
	private AllType allType;
	private ProductDetail productDetail;
}
