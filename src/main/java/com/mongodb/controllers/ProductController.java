package com.mongodb.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.entities.Product;
import com.mongodb.services.ProductServiceImpl;

@RestController
@RequestMapping("api/product")
public class ProductController {
	
	@Autowired
	ProductServiceImpl productService;
	
	
	@PostMapping("customer/products")
	public void addProductList(@RequestBody Product product)
	{
		productService.addProductList(product);
	}
	@GetMapping("customer/products")
	public List<Product> getProductList() {
		return  productService.getProductList();
	}
}
