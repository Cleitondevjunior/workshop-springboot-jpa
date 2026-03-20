package com.projetospringboot.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringboot.projeto.entities.Order;
import com.projetospringboot.projeto.repositories.OrderRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	// lista todos os pedidos
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	// busca por id
	public Order findById(Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
	}

	// insere novo pedido
	public Order insert(Order obj) {
		return orderRepository.save(obj);
	}

	// deleta pedido
	public void delete(Long id) {
		orderRepository.deleteById(id);
	}

	// atualiza pedido
	public Order update(Long id, Order obj) {
		try {
			Order entity = orderRepository.getReferenceById(id);

			// atualiza os campos necessários
			entity.setMoment(obj.getMoment());
			entity.setOrderStatus(obj.getOrderStatus());
			entity.setClient(obj.getClient());

			return orderRepository.save(entity);

		} catch (EntityNotFoundException e) {
			throw new RuntimeException("Id não encontrado " + id);
		}
	}
}