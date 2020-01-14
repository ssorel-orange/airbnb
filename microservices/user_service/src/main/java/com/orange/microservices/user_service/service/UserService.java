/**
 * 
 */
package com.orange.microservices.user_service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orange.microservices.user_service.controller.UserController;
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
	
}
