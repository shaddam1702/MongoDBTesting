package com.mongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mongodb.entities.Product;
import com.mongodb.repositories.ProductRepository;

@Service
public class ProductServiceImpl {

	@Autowired
	ProductRepository productRepository;
	public List<Product>getProductList() {
		// TODO Auto-generated method stub
		return productRepository.getProductList();
	}

	public void addProductList(Product product) {
		// TODO Auto-generated method stub
		
		productRepository.addProductList(product);
	}

}
