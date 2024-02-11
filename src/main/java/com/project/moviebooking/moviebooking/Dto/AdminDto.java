package com.project.moviebooking.moviebooking.Dto;

import java.util.List;

import com.project.moviebooking.moviebooking.entity.Theatre;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

public class AdminDto {
	private int AdminId;
	private String AdminEmail;
	@OneToMany
	List<Theatre>theatre;
	@Override
	public String toString() {
		return "AdminDto [AdminId=" + AdminId + ", AdminEmail=" + AdminEmail + ", theatre=" + theatre + "]";
	}
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
	public List<Theatre> getTheatre() {
		return theatre;
	}
	public void setTheatre(List<Theatre> theatre) {
		this.theatre = theatre;
	}
	
	
}
