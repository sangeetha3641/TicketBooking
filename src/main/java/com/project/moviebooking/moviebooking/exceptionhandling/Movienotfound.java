package com.project.moviebooking.moviebooking.exceptionhandling;

public class Movienotfound extends RuntimeException{
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Movienotfound(String message) {
		this.message = message;
	}

	
	


}
