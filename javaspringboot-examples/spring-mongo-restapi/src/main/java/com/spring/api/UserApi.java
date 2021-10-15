package com.spring.api;

import com.spring.entity.User;
import com.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 15/10/2021
 **   Time : 8:32 AM
 **/
@RestController
@RequestMapping("User")
public class UserApi {
	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void init(){
		User user = new User();
		user.setName("Mehmet");
		user.setSurname("ERÖZKAN");
		userRepository.save(user);
	}

	@PostMapping
	public ResponseEntity<User> add(@RequestBody User user){
		return ResponseEntity.ok(userRepository.save(user));
	}

	@GetMapping
	public ResponseEntity<List<User>> getList(){
		return ResponseEntity.ok(userRepository.findAll());
	}
}
