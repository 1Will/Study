package com.wy.springmvc.form;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductForm {
	private String name;
	private String description;
	private String price;
	private Long weight;
	private String size;
}
