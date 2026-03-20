package com.projetospringboot.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringboot.projeto.entities.Product;
import com.projetospringboot.projeto.repositories.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {

	@Autowired	
	private ProductRepository productRepository;

	// lista todos os produtos
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	// busca por id
	public Product findById(Long id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.orElseThrow(() -> new RuntimeException("Produto não encontrado"));
	}

	// insere novo produto
	public Product insert(Product obj) {
		return productRepository.save(obj);
	}

	// deleta produto
	public void delete(Long id) {
		productRepository.deleteById(id);
	}

	// atualiza produto
	public Product update(Long id, Product obj) {
		try {
			Product entity = productRepository.getReferenceById(id);

			// atualiza os campos
			entity.setName(obj.getName());
			entity.setDescription(obj.getDescription());
			entity.setPrice(obj.getPrice());
			entity.setImgUrl(obj.getImgUrl());

			return productRepository.save(entity);

		} catch (EntityNotFoundException e) {
			throw new RuntimeException("Id não encontrado " + id);
		}
	}
}