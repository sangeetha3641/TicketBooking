package com.project.moviebooking.moviebooking.exceptionhandling;

public class TheatreNotFound extends RuntimeException {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TheatreNotFound(String message) {
		this.message = message;
	}
	

}
