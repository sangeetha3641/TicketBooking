package com.project.moviebooking.moviebooking.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Component
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int AdminId;
	private String AdminEmail;
	private String password;
	@OneToMany(cascade = CascadeType.ALL)
	List<Theatre>theatre;
	
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public String getAdminEmail() {
		return AdminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		AdminEmail = adminEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
