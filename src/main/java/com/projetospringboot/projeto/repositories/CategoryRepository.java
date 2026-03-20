package com.projetospringboot.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.projeto.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
