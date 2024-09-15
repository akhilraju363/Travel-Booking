package com.service;

import java.util.List;

import com.Entity.User;

public interface UserService {

	public User createUser(User user) throws Exception;
		// TODO Auto-generated method stub
		//return null;
	

	public User getUserById(Long id)  throws Exception;
		// TODO Auto-generated method stub
	//	return null;
	

	public List<User> getAllUsers() throws Exception;
		// TODO Auto-generated method stub
	//	return null;
	

	public User updateUser(Long id, User userDetails) throws Exception;
		// TODO Auto-generated method stub
	//	return null;
	

	public boolean deleteUser(Long id) throws Exception;
		// TODO Auto-generated method stub
	//	return false;
	

}
