package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "bet_detail" , groupId = "codeDecode_Topic")
	public void listenToTopic(String receivedMessage) {
		
		System.out.println("The message received is : "+receivedMessage);
	}
}
