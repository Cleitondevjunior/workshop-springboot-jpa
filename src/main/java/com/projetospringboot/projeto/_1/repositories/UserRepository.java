package com.projetospringboot.projeto._1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.projeto._1.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
