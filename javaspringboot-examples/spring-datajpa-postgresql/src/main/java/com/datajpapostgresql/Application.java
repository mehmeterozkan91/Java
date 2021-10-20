package com.datajpapostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 **   Users : Mehmet ERÖZKAN
 **   Date : 19/10/2021
 **   Time : 2:00 PM
 **/
@SpringBootApplication
@EnableJpaRepositories // tüm jpa instance olusturacak
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
