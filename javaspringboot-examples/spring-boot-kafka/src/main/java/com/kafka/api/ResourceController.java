package com.kafka.api;

import com.kafka.dto.KMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
/**
 **   User : Mehmet ERÖZKAN
 **   Date : 02/11/2021
 **   Time : 2:00 PM
 **/

@RestController
@RequestMapping("/kmessage")
@RequiredArgsConstructor
public class ResourceController {

	@Value("${example.kafka.topic}")
	private String                                topic;

	private final KafkaTemplate<String, KMessage> kafkaTemplate;

	@PostMapping
	public void sendMessage(@RequestBody KMessage kMessage) {
		kafkaTemplate.send(topic, UUID.randomUUID().toString(), kMessage);
	}
}
