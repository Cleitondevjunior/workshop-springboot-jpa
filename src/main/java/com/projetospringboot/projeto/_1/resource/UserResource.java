package com.projetospringboot.projeto._1.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetospringboot.projeto._1.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "cleiton","cleiton@gmail.com", "91999999999","123456");
		return ResponseEntity.ok().body(u);
	}
}
