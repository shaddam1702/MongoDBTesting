package com.mongodb.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoClient;
import com.mongodb.entities.Product;

@Repository
public class ProductRepository {

    private final MongoTemplate mongotemplate;
    @Autowired
    public ProductRepository(MongoTemplate mongoTemplate) {
        this.mongotemplate = mongoTemplate;
    }
   
   public List<Product> getProductList()
   {  
	   
	   return mongotemplate.findAll(Product.class);
   }
   
   public void addProductList(Product product) {
	   mongotemplate.save(product);

	  
   }
}
