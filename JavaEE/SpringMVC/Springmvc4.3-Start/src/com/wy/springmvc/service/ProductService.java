package com.wy.springmvc.service;

import java.util.Map;

import com.wy.springmvc.domain.Product;
import com.wy.springmvc.form.ProductForm;

public interface ProductService {
	Product add(Product product);

	Product get(long id);

	Map<Long, Product> getAll();

	void del(Long id);

	Product update(long id, ProductForm productForm);

}
