package com.ssm.shopstore.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ShopCart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4054237628090598635L;
	
	private Integer id;
	private User user;
	private ProductDetail productDetail;
	private Integer count;
}
