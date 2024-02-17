package com.project.moviebooking.moviebooking.exceptionhandling;

public class UserNotFound  extends RuntimeException{
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserNotFound(String message) {
		super();
		this.message = message;
	}


}
