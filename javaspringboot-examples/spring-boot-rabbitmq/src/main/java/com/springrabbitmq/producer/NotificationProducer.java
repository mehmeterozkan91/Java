package com.springrabbitmq.producer;

import com.springrabbitmq.model.Notification;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.UUID;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 22/10/2021
 **   Time : 11:21 AM
 **/
@Service
public class NotificationProducer {
	@Value("${sr.rabbit.routing.name}")
	private String routingName;
	@Value("${sr.rabbit.exchange.name}")
	private String exchangeName;

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@PostConstruct
	public void init() {
		Notification notification = new Notification();
		notification.setId(UUID.randomUUID().toString());
		notification.setCreatedAt(new Date());
		notification.setMessage("Welcome Mehmet ERÖZKAN");
		notification.setSeen(Boolean.FALSE);
		sendToQuene(notification);
	}

	public void sendToQuene(Notification notification) {
		System.out.println("Notification Send : " + notification.getId());
		rabbitTemplate.convertAndSend(exchangeName,routingName, notification);
	}
}
