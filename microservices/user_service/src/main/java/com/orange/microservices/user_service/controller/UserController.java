/**
 * 
 */
package com.orange.microservices.user_service.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orange.microservices.user_service.domain.User;
import com.orange.microservices.user_service.repository.UserRepository;

/**
 * @author steph
 *
 */
@RestController
@RequestMapping("/api/user/v1")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> listUser () {
		
		return (List<User>) userRepo.findAll();
	}
	
	
	@GetMapping(path = "/users/{id}")
	public User getUser (@PathVariable Integer id) {
		Optional<User> optionalUser =userRepo.findById(id);
		return optionalUser.get();
		
	}
	
	@PutMapping(path = "/users/{id}")
	public User updateUserById(@PathVariable Integer id, @RequestBody User updatedUser) {
		updatedUser.setId(id);
		return userRepo.save(updatedUser);
	}
	
	@PostMapping(path = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
	public User createUser(@RequestBody User user) {		
		return userRepo.save(user);
	}
	
	@DeleteMapping(path = "/users/{id}")
	public String deleteUserById(@PathVariable Integer id,@RequestBody User updatedUser) {
		updatedUser.setId(id);
		userRepo.delete(updatedUser);
		return "Utilisateur supprimé";
	}
	
	
	
	
	
	
	
	
}
