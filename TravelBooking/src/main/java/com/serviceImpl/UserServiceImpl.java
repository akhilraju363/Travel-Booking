package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.User;
import com.repository.UserRepository;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	  @Autowired
	    private UserRepository userRepository;
	
	org.slf4j.Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public User createUser(User user) throws Exception {
		Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
		if(existingUser.isPresent()) {
			throw new  	Exception("Email alredly in use");
		}
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(Integer id, User userDetails) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
}