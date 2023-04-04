package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	


	@Override
	public User saveUser(User user) {
		User users = userRepository.save(user);
		return users;
	}
	
	@Override
	public Iterable<User> saveAll(List<User> user) {
        Iterable<User> users = userRepository.saveAll(user);
		return users;
		
	}


	@Override
	public List<User> getUserByClientId(Integer clientid) {
		List<User> user = userRepository.findByClientId(clientid);
		return user;
	}


	@Override
	public List<User> getUserByGame(String game) {
		List<User> user= userRepository.getUserByGame(game);
		return user;
	}


	@Override
	public List<User> getUserByDate(String date) {
		List<User> users=userRepository.getUserByDate(date);
		return users;
	}

	
}
