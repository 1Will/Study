package com.ssm.shopstore.service;

import java.util.List;

import com.ssm.shopstore.domain.ProductDetail;

public interface ProductDetailService {

	
	public List<ProductDetail> getProductByName(String name);
	public ProductDetail getProductById(Integer id);

}
