package com.swap.service;

import java.util.List;

import com.swap.entity.User;

public interface UserService {

	public User getUser(Long id);
	public List<User> getUsers();
	
}
