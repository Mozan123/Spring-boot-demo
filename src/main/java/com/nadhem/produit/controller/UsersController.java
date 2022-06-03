


package com.nadhem.produit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nadhem.produit.model.Users;
import com.nadhem.produit.repository.userJpaRespository;

@RestController
@RequestMapping("/users")
public class UsersController {
	@Autowired
	private userJpaRespository userJpaRespository;

	@RequestMapping(value="/all", method = RequestMethod.GET)
	
	@GetMapping(value="/all")
	public List <Users> findAll(){
	return userJpaRespository.findAll();}
	/////////////////////////////////////////////////////////////
	@GetMapping(value="/{name}")
	public Users findByName(@PathVariable final String name) {
		return userJpaRespository.findByName(name);
	}
	////////////////////////////////////////////////////////
	@PostMapping(value="/load")
	public Users load(@RequestBody final Users users) {
		userJpaRespository.save(users);
		return userJpaRespository.findByName(users.getName());
	}
	}

