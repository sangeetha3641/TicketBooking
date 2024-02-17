package com.project.moviebooking.moviebooking.exceptionhandling;

public class SeatNotFound  extends RuntimeException{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SeatNotFound [message=" + message + "]";
	}

}
