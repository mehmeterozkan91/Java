package com.springjwt.api;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 11/11/2021
 **   Time : 11:59 AM
 **/

import com.springjwt.auth.TokenManager;
import com.springjwt.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthConroller {

	@Autowired
	private TokenManager tokenManager;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping
	public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));

			return ResponseEntity.ok(tokenManager.generateToken(loginRequest.getUsername()));
		} catch (Exception e) {
			throw e;
		}
	}
}
