package com.example.demo;

import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class PrudentGamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrudentGamingApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(UserService userService) {
		return args -> {
			
			ObjectMapper objectMapper = new ObjectMapper();
			
			TypeReference<List<User>> typeReference = new TypeReference<List<User>>() {};
			
			InputStream inputStream  = TypeReference.class.getResourceAsStream("/UserData.json");
			
			try {
				
				List<User> user = objectMapper.readValue(inputStream, typeReference);
			
				userService.saveAll(user);
			
				System.out.println("Successfully inserted the Json data into db ");
			
			
			}catch(Exception e) {
				
				e.printStackTrace();
			}
			
		};

	}
}
