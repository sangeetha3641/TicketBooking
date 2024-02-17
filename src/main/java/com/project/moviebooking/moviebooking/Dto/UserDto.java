package com.project.moviebooking.moviebooking.Dto;

import java.util.List;


import com.project.moviebooking.moviebooking.entity.Ticket;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class UserDto {
	private int Userid;
	private String Username;
	private String usermail;
	@OneToOne
	private Ticket ticket;
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
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	@Override
	public String toString() {
		return "UserDto [Userid=" + Userid + ", Username=" + Username + ", usermail=" + usermail + ", ticket=" + ticket
				+ "]";
	}
	

}
