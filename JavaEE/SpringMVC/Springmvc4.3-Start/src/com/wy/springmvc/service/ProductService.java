package com.wy.springmvc.service;

import com.wy.springmvc.domain.Product;

public interface ProductService {
	Product add(Product product);
	Product get(long id);

}
