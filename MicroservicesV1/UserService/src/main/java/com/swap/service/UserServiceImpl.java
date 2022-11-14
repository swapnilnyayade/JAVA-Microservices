package com.swap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.swap.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	//Fake User Data
	private List<User> userList = List.of(
			new User(1311L, "Swapnil Nyayade", "1234567890"),
			new User(1312L, "Ajit Nyayade", "3456789012"),
			new User(1313L, "Ramesh Nyayade", "5678901234")
			
			);

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return userList.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userList;
	}
	

	
}
