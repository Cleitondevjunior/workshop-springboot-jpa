package com.projetospringboot.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.projeto.entities.Category;

// interface responsável por acessar dados da entidade Category
// JpaRepository já fornece CRUD completo automaticamente
public interface CategoryRepository extends JpaRepository<Category, Long> {

}