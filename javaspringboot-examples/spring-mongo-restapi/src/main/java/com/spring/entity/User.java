package com.spring.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 15/10/2021
 **   Time : 8:21 AM
 **/
@Document
public class User {
	@Id
	private String id;
	private String name;
	private String surname;
	private HashMap properties;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public HashMap getProperties() {
		return properties;
	}

	public void setProperties(HashMap properties) {
		this.properties = properties;
	}
}
