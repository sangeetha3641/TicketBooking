package com.project.moviebooking.moviebooking.exceptionhandling;

public class TheatreAdminNotFound  extends RuntimeException{
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TheatreAdminNotFound(String message) {
		this.message = message;
	}


}
