package com.service;

import java.util.List;

import com.Entity.User;

public interface UserService {

	public User createUser(User user) throws Exception;
		// TODO Auto-generated method stub
		//return null;
	

	public User getUserById(Integer id)  throws Exception;
		// TODO Auto-generated method stub
	//	return null;
	

	public List<User> getAllUsers() throws Exception;
		// TODO Auto-generated method stub
	//	return null;
	

	public User updateUser(Integer id, User userDetails) throws Exception;
		// TODO Auto-generated method stub
	//	return null;
	

	public boolean deleteUser(Integer id) throws Exception;
		// TODO Auto-generated method stub
	//	return false;
	

}
