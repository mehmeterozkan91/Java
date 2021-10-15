package com.spring;

import com.spring.entity.User;
import com.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 15/10/2021
 **   Time : 8:20 AM
 **/

@SpringBootApplication
@EnableMongoRepositories
public class Application {




	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
