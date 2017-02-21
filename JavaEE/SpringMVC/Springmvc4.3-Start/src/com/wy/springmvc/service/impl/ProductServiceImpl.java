package com.wy.springmvc.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.wy.springmvc.domain.Product;
import com.wy.springmvc.form.ProductForm;
import com.wy.springmvc.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	private Map<Long, Product> products = new HashMap<Long, Product>();// 模数据库的数据保存与获取
	private AtomicLong generator = new AtomicLong();

	public ProductServiceImpl() {
		Product product = new Product();
		product.setName("MiBook");
		product.setDescription("MiBook write code is very cool!");
		product.setPrice(4999.0d);
		product.setWeight(49L);
		product.setSize("100*150");
		add(product);
	}

	@Override
	public Product add(Product product) {
		long newid = generator.incrementAndGet();
		product.setId(newid);

		// 保存到MAP中，此步模拟数据保存到数据库
		products.put(newid, product);
		return product;
	}

	@Override
	public Product get(long id) {
		return products.get(id);
	}

	@Override
	public Map<Long, Product> getAll() {
		return products;
	}

	@Override
	public void del(Long id) {
		products.remove(id);
	}

	@Override
	public Product update(long id, ProductForm productForm) {
		Product pro = products.get(id);
		pro.setName(productForm.getName());
		pro.setDescription(productForm.getDescription());
		pro.setWeight(productForm.getWeight());
		pro.setSize(productForm.getSize());
		try {
			pro.setPrice(Double.parseDouble(productForm.getPrice()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
