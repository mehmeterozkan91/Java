package com.springjwt.request;

import lombok.Data;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 11/11/2021
 **   Time : 12:00 PM
 **/
@Data
public class LoginRequest {

	private String email;

	private String username;

	private String password;

	public LoginRequest() {
	}

	public LoginRequest(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
