package com.springjwt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 11/11/2021
 **   Time : 11:34 AM
 **/
@RestController
@RequestMapping("/message")
public class HelloController {

	@GetMapping
	public ResponseEntity<String> getMessage(){
		return ResponseEntity.ok("Merhaba JWT");
	}
}
