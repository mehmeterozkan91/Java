package com.springelasticsearch.api;

import com.springelasticsearch.entity.User;
import com.springelasticsearch.repositories.UserRepositories;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 15/10/2021
 **   Time : 11:10 AM
 **/
@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserApi {
	private final UserRepositories userRepositories;

	@PostConstruct
	public void init() {
		User user = new User();
		user.setName("Mehmet");
		user.setSurname("ERÖZKAN");
		user.setAddress("Pendik, İSTANBUL");
		user.setBirth(Calendar.getInstance().getTime());
		userRepositories.save(user);
	}

//	@GetMapping("/{search}")
//	public ResponseEntity<List<User>> getUsers(@PathVariable String search) {
//		List<User> users = userRepositories.getByCustomQuery(search);
//		return ResponseEntity.ok(users);
//	}

	@GetMapping("/{search}")
	public ResponseEntity<List<User>> getUsers(@PathVariable String search) {
		List<User> users = userRepositories.findByNameLikeOrSurnameLike(search,search);
		return ResponseEntity.ok(users);
	}


}
