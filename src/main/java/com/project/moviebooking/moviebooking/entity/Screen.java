package com.project.moviebooking.moviebooking.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
@Component
public class Screen {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int screenid;
	private LocalTime showTime;
	private LocalDate showDate;
	private int seats;
	private Status s;//add no of seats
	@OneToOne(cascade = CascadeType.ALL)
	private Movie movie;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Seat>seat;
	public int getScreenid() {
		return screenid;
	}
	public void setScreenid(int screenid) {
		this.screenid = screenid;
	}
	public LocalTime getShowTime() {
		return showTime;
	}
	public void setShowTime(LocalTime showTime) {
		this.showTime = showTime;
	}
	public LocalDate getShowDate() {
		return showDate;
	}
	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public Status getS() {
		return s;
	}
	public void setS(Status s) {
		this.s = s;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public List<Seat> getSeat() {
		return seat;
	}
	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "Screen [screenid=" + screenid + ", showTime=" + showTime + ", showDate=" + showDate + ", seats=" + seats
				+ ", s=" + s + ", movie=" + movie + ", seat=" + seat + "]";
	}
	
	
	

}
