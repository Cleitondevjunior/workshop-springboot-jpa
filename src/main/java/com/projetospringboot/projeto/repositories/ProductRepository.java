package com.projetospringboot.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.projeto.entities.Product;


//interface responsável por acessar dados da entidade Product
//JpaRepository já fornece CRUD completo automaticamente
public interface ProductRepository  extends JpaRepository<Product, Long>{

}
