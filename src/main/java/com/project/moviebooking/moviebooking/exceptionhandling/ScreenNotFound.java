package com.project.moviebooking.moviebooking.exceptionhandling;

public class ScreenNotFound extends RuntimeException {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ScreenNotFound(String message) {
		this.message = message;
	}


}
