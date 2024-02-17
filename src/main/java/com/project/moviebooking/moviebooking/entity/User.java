package com.project.moviebooking.moviebooking.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Component
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
	private String username;
	@NotNull(message="admin emailcannot be null")
	@NotBlank(message="admin email cannot be blank")
	@Email(message="enter a valid email address")
	private String usermail;
	@NotNull(message="password cannot be null")
	@NotBlank(message="password cannot be null")
	@Size(min=8,message="password must be atleast 8 characters")
	@Pattern(regexp = "^(?=.[a-z])(?=.[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$",
	         message="password must be atleast 1 digit,1 uppercase,1 lowercase and 1 special character")
	private String password;
	private String userpassword;
	//reationship with review
	@OneToOne
	private Ticket ticket;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		username = username;
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
		return "User [Userid=" + userid + ", Username=" + username + ", usermail=" + usermail + ", userpassword="
				+ userpassword + ", booking=" +  ", review=" +  "]";
	}
	
}
