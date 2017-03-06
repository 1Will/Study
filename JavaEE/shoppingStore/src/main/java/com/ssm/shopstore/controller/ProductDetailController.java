package com.ssm.shopstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.shopstore.domain.ProductDetail;
import com.ssm.shopstore.service.ProductDetailService;

@Controller
public class ProductDetailController {
	
	@Autowired
	ProductDetailService productDetailService;
	
	@RequestMapping(value="/selectProduct")
	public String getProductByName(String name,Model model) {
		List<ProductDetail> products=productDetailService.getProductByName(name);
		model.addAttribute("products", products);
		return "list-one";
	}
	
	
	
	/*@RequestMapping(value = "/addUser")
	public void addUser(){
		User user =new User(null, "zhangsan", "13300112233", "sss");
		userService.addUser(user);
		System.out.println("添加成功");
	}*/
}
