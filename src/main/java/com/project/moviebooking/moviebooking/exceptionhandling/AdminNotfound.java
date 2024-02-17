package com.project.moviebooking.moviebooking.exceptionhandling;

public class AdminNotfound extends RuntimeException {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AdminNotfound(String message) {
		this.message = message;
	}

	

}
