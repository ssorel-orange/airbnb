/**
 * 
 */
package com.orange.microservices.user_service.repository;

import org.springframework.data.repository.CrudRepository;

import com.orange.microservices.user_service.domain.User;

/**
 * @author steph
 *
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}
