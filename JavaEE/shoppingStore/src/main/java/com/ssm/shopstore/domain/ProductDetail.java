package com.ssm.shopstore.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ProductDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8336292559640985684L;

	private Integer id;
	private String name;
	private Double oPrice;
	private Double rPrice;
	private Double jifen;
	private String brand;
	private String no;
	private Double weight;
	private String pPlace;
	private String image1;
	private String image2;
	private String image3;
	
	
}
