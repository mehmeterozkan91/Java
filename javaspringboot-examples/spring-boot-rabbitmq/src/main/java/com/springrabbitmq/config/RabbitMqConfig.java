package com.springrabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 22/10/2021
 **   Time : 11:24 AM
 **/
@Configuration
public class RabbitMqConfig {
	@Value("${sr.rabbit.queue.name}")
	private String queueName;
	@Value("${sr.rabbit.routing.name}")
	private String routingName;
	@Value("${sr.rabbit.exchange.name}")
	private String exchangeName;

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Bean
	public Queue queue(){
		return new Queue(queueName);
	}
	@Bean
	public DirectExchange directExchange(){
		return new DirectExchange(exchangeName);
	}
	@Bean
	public Binding  binding(final Queue queue, DirectExchange directExchange){
		return  BindingBuilder.bind(queue).to(directExchange).with(routingName);
	}



}
