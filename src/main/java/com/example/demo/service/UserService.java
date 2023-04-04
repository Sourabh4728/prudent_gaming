package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
	public User saveUser(User user);

	public Iterable<User> saveAll(List<User> user);

	public List<User> getUserByClientId(Integer clientid);
	
	public List<User> getUserByGame(String game);
	
	public List<User> getUserByDate(String date);
}
