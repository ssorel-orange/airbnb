/**
 * 
 */
package com.orange.microservices.user_service.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.orange.microservices.user_service.domain.User;

/**
 * @author steph
 *
 */
public interface UserRepository extends CrudRepository<User, Integer> {
	public Optional<User> findByLoginAndPassword(String login, String password);
}
