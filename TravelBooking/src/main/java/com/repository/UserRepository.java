package com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Entity.User;


	@Repository
	public interface UserRepository extends CrudRepository<User, Integer> {
		
        //get user details by ID
		@Query(value = "SELECT * FROM users WHERE id = ?1", nativeQuery = true)
		Optional<User> findById(Integer id);
		
	    // Find a user by their email
		@Query("SELECT u FROM User u WHERE u.email = ?1")
	    Optional<User> findByEmail(String email);
	    

	    // Find users by first name
	    List<User> findByFirstName(String firstName);

	    // Find users by last name
	    List<User> findByLastName(String lastName);

	    // Find users by first name and last name
	    List<User> findByFirstNameAndLastName(String firstName, String lastName);

		
	}


