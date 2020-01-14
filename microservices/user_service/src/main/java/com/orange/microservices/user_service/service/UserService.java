/**
 * 
 */
package com.orange.microservices.user_service.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orange.microservices.user_service.domain.User;
import com.orange.microservices.user_service.repository.UserRepository;

/**
 * @author steph
 *
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	private Logger logger = LoggerFactory.getLogger(UserService.class);
	
	public Optional<User> authenticate (User userToAuthenticate) {
		
		return userRepo.findByLoginAndPassword(userToAuthenticate.getLogin(), userToAuthenticate.getPassword());
		
	}
	
	
	
}
