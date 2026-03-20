package com.projetospringboot.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringboot.projeto.entities.Product;
import com.projetospringboot.projeto.repositories.ProductRepository;

@Service
public class ProductService {

@Autowired	
private ProductRepository ProductRepository;

public List<Product> findAll(){
	return ProductRepository.findAll();
}
public Product findById(Long id) {
  Optional<Product> obj = ProductRepository.findById(id);
	return obj.get();
}
}
