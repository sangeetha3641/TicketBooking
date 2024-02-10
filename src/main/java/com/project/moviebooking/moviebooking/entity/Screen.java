package com.project.moviebooking.moviebooking.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Screen {
	private int ScreenNumber;
	private LocalTime ShowTime;
	private LocalDate ShowDate;
	private Status s;
	@OneToOne
	private Movie movie;
	
	
	
	
	public int getScreenNumber() {
		return ScreenNumber;
	}
	public void setScreenNumber(int screenNumber) {
		ScreenNumber = screenNumber;
	}
	public LocalTime getShowTime() {
		return ShowTime;
	}
	public void setShowTime(LocalTime showTime) {
		ShowTime = showTime;
	}
	public LocalDate getShowDate() {
		return ShowDate;
	}
	public void setShowDate(LocalDate showDate) {
		ShowDate = showDate;
	}
	
	public Status getS() {
		return s;
	}
	public void setS(Status s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "Screen [ScreenNumber=" + ScreenNumber + ", ShowTime=" + ShowTime + ", ShowDate=" + ShowDate + ", s=" + s
				+ ", movie=" + movie + "]";
	}
	
	
	

}
