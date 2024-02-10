package com.project.moviebooking.moviebooking.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
@Entity
public class Booking {
	private String MovieName;
	private LocalDate Showdate;
	private LocalTime showtime;
	private int Totalamount;
	
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public LocalDate getShowdate() {
		return Showdate;
	}
	public void setShowdate(LocalDate showdate) {
		Showdate = showdate;
	}
	public LocalTime getShowtime() {
		return showtime;
	}
	public void setShowtime(LocalTime showtime) {
		this.showtime = showtime;
	}
	public int getTotalamount() {
		return Totalamount;
	}
	public void setTotalamount(int totalamount) {
		Totalamount = totalamount;
	}
	@Override
	public String toString() {
		return "Booking [MovieName=" + MovieName + ", Showdate=" + Showdate + ", showtime=" + showtime
				+ ", Totalamount=" + Totalamount + "]";
	}
	
}
