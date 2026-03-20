package com.projetospringboot.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.projeto.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
