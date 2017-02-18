package com.wy.springmvc.service;

import java.util.Map;

import com.wy.springmvc.domain.Product;

public interface ProductService {
	Product add(Product product);
	//Product update(Product product);
	Product get(long id);
	Map<Long, Product> getAll();

}
