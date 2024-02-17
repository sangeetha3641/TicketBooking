package com.project.moviebooking.moviebooking.exceptionhandling;

public class bookingnotavailable extends RuntimeException{

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public bookingnotavailable(String message) {
		this.message = message;
	}

}
