package com.dockerization;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 27/10/2021
 **   Time : 4:16 PM
 **/
@RestController
@RequestMapping("/message")
public class MessageAPI {
	@GetMapping
	public String message(){
		return "This is dockerization message";
	}
}
