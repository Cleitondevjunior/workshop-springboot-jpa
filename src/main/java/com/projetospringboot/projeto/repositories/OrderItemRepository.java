package com.projetospringboot.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.projeto.entities.OrderItem;
import com.projetospringboot.projeto.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}