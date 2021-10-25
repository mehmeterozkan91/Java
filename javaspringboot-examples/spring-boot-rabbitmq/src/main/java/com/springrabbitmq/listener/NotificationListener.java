package com.springrabbitmq.listener;

import com.springrabbitmq.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 22/10/2021
 **   Time : 11:21 AM
 **/
@Service
public class NotificationListener {

	@RabbitListener(queues = "queue-name")
	public void handlerMessage(Notification notification){
		System.out.println("MEssage received...");
		System.out.println(notification.toString());
	}
}
