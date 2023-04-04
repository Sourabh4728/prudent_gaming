package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.Producer;
import com.example.demo.service.UserServiceImpl;

@RestController
@RequestMapping("/user")

public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@Autowired
	Producer producer;

	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		User user2 = userService.saveUser(user);
		return ResponseEntity.ok().body(user2);
	}
	
	@GetMapping("/getUserByClientId/{clientid}")
	public ResponseEntity<List<User>> getUserByClientId(@PathVariable("clientid") Integer clientid){
		List<User> user = userService.getUserByClientId(clientid);
		return ResponseEntity.ok().body(user);
	}
	
	@GetMapping("/getUserByGame/{game}")
	public ResponseEntity<List<User>> getUserByGame(@PathVariable("game") String game){
		List<User> user= userService.getUserByGame(game);
		return ResponseEntity.ok().body(user);
	}

	@GetMapping("/getUserByDate/{date}")
	public ResponseEntity<List<User>> getUserByDate(@PathVariable("date") String date){
		List<User> user= userService.getUserByDate(date);
		return ResponseEntity.ok().body(user);
	}
	
	@GetMapping("/producerMessage")
	public void getMessageFromClient(@RequestParam("message") String message) {
		producer.sendMessageToTopic(message);
	
		
	}
}