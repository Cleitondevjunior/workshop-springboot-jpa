package com.projetospringboot.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringboot.projeto.entities.Category;
import com.projetospringboot.projeto.repositories.CategoryRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CategoryService {

	@Autowired	
	private CategoryRepository categoryRepository;

	// busca todas as categorias
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	// busca por id
	public Category findById(Long id) {
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
	}

	// insere nova categoria
	public Category insert(Category obj) {
		return categoryRepository.save(obj);
	}

	// deleta por id
	public void delete(Long id) {
		categoryRepository.deleteById(id);
	}

	// atualiza categoria
	public Category update(Long id, Category obj) {
		try {
			Category entity = categoryRepository.getReferenceById(id);
			entity.setName(obj.getName());
			return categoryRepository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new RuntimeException("Id não encontrado " + id);
		}
	}
}