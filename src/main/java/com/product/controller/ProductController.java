package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping("/getproductdetails")
  public List<Product> getAllUsers() {
    return productRepository.findAll();
  }

 
}
