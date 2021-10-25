package com.springrabbitmq;

import com.springrabbitmq.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.UUID;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 22/10/2021
 **   Time : 10:16 AM
 **/
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
