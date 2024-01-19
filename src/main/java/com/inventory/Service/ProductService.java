package com.inventory.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.Dao.Product;
import com.inventory.Repository.ProductRepository;

//ProductService.java
@Service
public class ProductService {
 @Autowired
 private ProductRepository productRepository;

 public List<Product> getAllProducts() {
     return productRepository.findAll();
 }

 public Product getProductById(Long productId) {
     return productRepository.findById(productId).orElse(null);
 }
}
