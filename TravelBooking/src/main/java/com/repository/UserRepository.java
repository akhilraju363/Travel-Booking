package com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.User;


	@Repository
	public interface UserRepository extends JpaRepository<User, Long> {

	    // Find a user by their email
	    Optional<User> findByEmail(String email);

	    // Find users by first name
	    List<User> findByFirstName(String firstName);

	    // Find users by last name
	    List<User> findByLastName(String lastName);

	    // Find users by first name and last name
	    List<User> findByFirstNameAndLastName(String firstName, String lastName);
	}


