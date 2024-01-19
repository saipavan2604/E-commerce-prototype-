package com.inventory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.Dao.Product;

//ProductRepository.java
public interface ProductRepository extends JpaRepository<Product, Long> {
 // Add custom queries as needed
}
