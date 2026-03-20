package com.projetospringboot.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.projeto.entities.Order;


//interface responsável por acessar dados da entidade Order
//JpaRepository já fornece CRUD completo automaticamente
public interface OrderRepository  extends JpaRepository<Order, Long>{

}
