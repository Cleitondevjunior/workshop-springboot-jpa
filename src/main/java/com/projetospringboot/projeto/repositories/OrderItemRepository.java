package com.projetospringboot.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.projetospringboot.projeto.entities.OrderItem;
import com.projetospringboot.projeto.entities.pk.OrderItemPK;

//interface responsável por acessar dados da entidade OrderItem
//JpaRepository já fornece CRUD completo automaticamente

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}