package com.ssm.shopstore.dao;

import java.util.List;

import com.ssm.shopstore.domain.ProductDetail;

public interface ProductDetailMapping {
	
	public List<ProductDetail> getProductByName(String name);
	public ProductDetail getProductById(Integer id);
	

}
