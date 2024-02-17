package com.project.moviebooking.moviebooking.exceptionhandling;

public class ReviewNotFound extends RuntimeException{
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ReviewNotFound(String message) {
		super();
		this.message = message;
	}

	
	

}
