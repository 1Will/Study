package com.wy.springmvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.wy.springmvc.domain.Product;
import com.wy.springmvc.form.ProductForm;
import com.wy.springmvc.service.ProductService;

@Controller
public class ProductController {

	private static final Logger logger = Logger.getLogger(ProductController.class);
	// 自动注入向后端数据库写数据的组件
	@Autowired
	private ProductService productService;
	@Autowired
	private HttpServletRequest request;

	@RequestMapping(value = "/product_input")
	private String inputProduct() {
		logger.info("inputProduct 被调用");
		return "ProductForm";
	}

	@RequestMapping(value = "/product_save", method = RequestMethod.POST)
	public String saveProduct(ProductForm productForm, RedirectAttributes redirectAttributes) {
		logger.info("saveProduct 被调用！");
		Product product = new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		product.setWeight(productForm.getWeight());
		product.setSize(productForm.getSize());

		try {
			product.setPrice(Double.parseDouble(productForm.getPrice()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// add product
		Product saveProduct = productService.add(product);
		// 使用下面对象，可以给重定向传值
		redirectAttributes.addFlashAttribute("message", "The product was successfully added!");

		return "redirect:/product_view/" + saveProduct.getId() + ".action";
	}

	// http://localhost:8080/SpringMVC4.3-Start/product_view/2.action
	@RequestMapping(value = "/product_view/{id}") // {}内的id为路径变量
	public String viewProduct(@PathVariable Long id, Model model) {
		logger.info("viewProduct 被调用！");
		Product product = productService.get(id);
		model.addAttribute("product", product);
		return "ProductView";
	}

	// http://localhost:8080/SpringMVC4.3-Start/product_retrieve.action?id=4
	@RequestMapping(value = "/product_retrieve")
	public String sendProduct(@RequestParam Long id, Model model) {
		Product product = productService.get(id);
		model.addAttribute("product", product);
		return "ProductView";
	}

	@RequestMapping(value = "/product_viewAll")
	public String viewAllProduct(Model model) {
		logger.info("viewAllProduct 被调用！");
		Map<Long, Product> products = productService.getAll();
		model.addAttribute("products", products);
		return "ProductViewAll";
	}

	// 通过id修改，传到修改页面
	@RequestMapping(value = "/product_update", method = RequestMethod.POST)
	public String updateProduct(Model model, ProductForm productForm) {
		logger.info("updateProduct 被调用！");
		Long id = Long.parseLong(request.getParameter("id"));
		model.addAttribute("id", id);
		Product product = productService.get(id);
		model.addAttribute("product", product);
		return "ProductUpdate";
	}

	// 修改数据
	@RequestMapping(value = "/product_update2", method = RequestMethod.POST)
	public String updateProduct2(Model model, ProductForm productForm) {
		logger.info("updateProduct2 被调用！");
		Long id = Long.parseLong(request.getParameter("id"));
		productService.update(id, productForm);
		return "redirect:/product_viewAll.action";
	}

	// 删除数据
	@RequestMapping(value = "/product_delete", method = RequestMethod.POST)
	public String deleteProduct(Model model, ProductForm productForm) {
		logger.info("deleteProduct 被调用！");
		Long id = Long.parseLong(request.getParameter("id"));
		productService.del(id);
		return "redirect:/product_viewAll.action";
	}
}
