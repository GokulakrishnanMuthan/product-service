package com.gk.product_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.product_service.entity.Product;
import com.gk.product_service.repository.ProductRepository;


@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository; 
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	
	@GetMapping
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<Product> getProductById(@PathVariable Long productId){
		Product product=productRepository.findById(productId).orElseThrow( ()-> new RuntimeException("Product Not foudn with ID: "+productId));
		return ResponseEntity.ok(product);
	}
	
	
}
