package com.projetospringboot.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringboot.projeto.entities.User;
import com.projetospringboot.projeto.repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired	
	private UserRepository userRepository;

	// lista todos os usuários
	public List<User> findAll() {
		return userRepository.findAll();
	}

	// busca por id
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
	}

	// insere novo usuário
	public User insert(User obj) {
		return userRepository.save(obj);
	}

	// deleta usuário
	public void delete(Long id) {
		userRepository.deleteById(id);
	}

	// atualiza usuário
	public User update(Long id, User obj) {
		try {
			User entity = userRepository.getReferenceById(id);

			// atualiza os campos
			entity.setName(obj.getName());
			entity.setEmail(obj.getEmail());
			entity.setPhone(obj.getPhone());
			entity.setPassword(obj.getPassword());

			return userRepository.save(entity);

		} catch (EntityNotFoundException e) {
			throw new RuntimeException("Id não encontrado " + id);
		}
	}
}