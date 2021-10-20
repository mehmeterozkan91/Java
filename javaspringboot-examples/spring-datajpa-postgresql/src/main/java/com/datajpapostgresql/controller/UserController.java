package com.datajpapostgresql.controller;

import com.datajpapostgresql.dto.UserDto;
import com.datajpapostgresql.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 **   Users : Mehmet ERÖZKAN
 **   Date : 20/10/2021
 **   Time : 2:27 PM
 **/
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@PostMapping
	public ResponseEntity<UserDto> add(@RequestBody UserDto userDto){
		return ResponseEntity.ok(userService.save(userDto));
	}

	@GetMapping
	public ResponseEntity<List<UserDto>> getAllData(){
		return ResponseEntity.ok(userService.getAll());
	}

}
