package com.project.moviebooking.moviebooking.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
@Component
public class Screen {
	private int ScreenNumber;
	private LocalTime ShowTime;
	private LocalDate ShowDate;
	private int seats;
	private Status s;//add no of seats
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
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Screen [ScreenNumber=" + ScreenNumber + ", ShowTime=" + ShowTime + ", ShowDate=" + ShowDate + ", seats="
				+ seats + ", s=" + s + ", movie=" + movie + "]";
	}
	
	
	
	

}
