package com.projetospringboot.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.projeto.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
