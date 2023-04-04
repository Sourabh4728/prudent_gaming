package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

@Service
public class Producer {

	@Autowired
	KafkaTemplate<String , String> kafkaTemp;
	
	public void sendMessageToTopic(String message) {
	
		kafkaTemp.send("bet_detail", message);
	}

}