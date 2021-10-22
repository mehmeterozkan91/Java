package com.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 22/10/2021
 **   Time : 8:24 AM
 **/
@SpringBootApplication
@EnableSwagger2 // try to link http://localhost:8082/swagger-ui/index.html#/
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
