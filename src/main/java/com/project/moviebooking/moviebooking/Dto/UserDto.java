package com.project.moviebooking.moviebooking.Dto;

import java.util.List;

import com.project.moviebooking.moviebooking.entity.Booking;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

public class UserDto {
	private int Userid;
	private String Username;
	private String usermail;
	@OneToMany
	private List<Booking> booking;
	@Override
	public String toString() {
		return "UserDto [Userid=" + Userid + ", Username=" + Username + ", usermail=" + usermail + ", booking="
				+ booking + "]";
	}
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public List<Booking> getBooking() {
		return booking;
	}
	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
	

}
