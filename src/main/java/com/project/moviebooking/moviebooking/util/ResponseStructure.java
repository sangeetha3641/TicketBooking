package com.project.moviebooking.moviebooking.util;

public class ResponseStructure<T> {
	private String message;
	private int Status;
	private T data;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponseStructure [message=" + message + ", Status=" + Status + ", data=" + data + "]";
	}
	

}
