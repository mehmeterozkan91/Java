package com.springrabbitmq.model;

import java.io.Serializable;
import java.util.Date;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 22/10/2021
 **   Time : 11:19 AM
 **/
public class Notification implements Serializable {
	private String id;
	private Date createdAt;
	private Boolean seen;
	private String message;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Boolean getSeen() {
		return seen;
	}

	public void setSeen(Boolean seen) {
		this.seen = seen;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override public String toString() {
		return "Notification{" +
				"id='" + id + '\'' +
				", createdAt=" + createdAt +
				", seen=" + seen +
				", message='" + message + '\'' +
				'}';
	}
}
