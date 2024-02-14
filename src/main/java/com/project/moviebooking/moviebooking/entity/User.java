package com.project.moviebooking.moviebooking.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Userid;
	private String Username;
	private String usermail;
	private String userpassword;
	@OneToMany(cascade = CascadeType.ALL)//reationship with review
	private List<Booking> booking;
	@OneToOne
	private Review review;
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
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
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	@Override
	public String toString() {
		return "User [Userid=" + Userid + ", Username=" + Username + ", usermail=" + usermail + ", userpassword="
				+ userpassword + ", booking=" + booking + ", review=" + review + "]";
	}
	
}
