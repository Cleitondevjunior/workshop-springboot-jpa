package com.projetospringboot.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.projeto.entities.User;

//interface responsável por acessar dados da entidade User
//JpaRepository já fornece CRUD completo automaticamente
public interface UserRepository  extends JpaRepository<User, Long>{

}
