package com.kafka.service;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 02/11/2021
 **   Time : 2:03 PM
 **/

import com.kafka.dto.KMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaListenerService {

	@KafkaListener(
			topics = "${example.kafka.topic}",
			groupId = "${example.kafka.group.id}"
	)
	public void listen(@Payload KMessage message) {
		log.info("Message received.. MessageID : {} Message: {} Date : {}",
				message.getId(),
				message.getMessage(),
				message.getMessageDate());
	}
}
