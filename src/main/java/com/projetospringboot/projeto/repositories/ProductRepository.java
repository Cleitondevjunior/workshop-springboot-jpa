package com.projetospringboot.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.projeto.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
