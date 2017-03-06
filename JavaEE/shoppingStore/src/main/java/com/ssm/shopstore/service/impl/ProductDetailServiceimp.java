package com.ssm.shopstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.shopstore.dao.ProductDetailMapping;
import com.ssm.shopstore.domain.ProductDetail;
import com.ssm.shopstore.service.ProductDetailService;

@Service("ProductDetailService")
public class ProductDetailServiceimp implements ProductDetailService {
	@Autowired
	public ProductDetailMapping productDetailMapping;

	@Override
	public List<ProductDetail> getProductByName(String name) {
		return productDetailMapping.getProductByName(name);
	}

	@Override
	public ProductDetail getProductById(Integer id) {
		
		return productDetailMapping.getProductById(id);
	}
	
	
}