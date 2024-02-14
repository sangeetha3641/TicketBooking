package com.project.moviebooking.moviebooking.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Component
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Bookingid;
	
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
	public int getBookingid() {
		return Bookingid;
	}
	public void setBookingid(int bookingid) {
		Bookingid = bookingid;
	}
	@Override
	public String toString() {
		return "Booking [Bookingid=" + Bookingid + ", MovieName=" + MovieName + ", Showdate=" + Showdate + ", showtime="
				+ showtime + ", Totalamount=" + Totalamount + "]";
	}
	
	
}
