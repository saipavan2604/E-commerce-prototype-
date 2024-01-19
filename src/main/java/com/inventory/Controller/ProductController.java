package com.inventory.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.Dao.Product;
import com.inventory.Service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
 @Autowired
 private ProductService productService;

 @GetMapping("/all")
 public ResponseEntity<List<Product>> getAllProducts() {
     List<Product> products = productService.getAllProducts();
     return new ResponseEntity<>(products, HttpStatus.OK);
 }

 @GetMapping("/{productId}")
 public ResponseEntity<Product> getProductById(@PathVariable Long productId) {
     Product product = productService.getProductById(productId);

     if (product != null) {
         return new ResponseEntity<>(product, HttpStatus.OK);
     } else {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }
 }
}
