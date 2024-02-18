package com.project.moviebooking.moviebooking.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Component
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int adminId;
	@NotNull(message="admin emailcannot be null")
	@NotBlank(message="admin email cannot be blank")
	@Email(message="enter a valid email address")
	private String adminEmail;
	@NotNull(message="password cannot be null")
	@NotBlank(message="password cannot be null")
	@Size(min=8,message="password must be atleast 8 characters")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$",
	         message="password must be atleast 1 digit,1 uppercase,1 lowercase and 1 special character")
	private String password;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Theatre>theatre;
	@OneToMany (cascade = CascadeType.ALL)
	private List<TheatreAdmin>th;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Theatre> getTheatre() {
		return theatre;
	}
	public void setTheatre(List<Theatre> theatre) {
		this.theatre = theatre;
	}
	public List<TheatreAdmin> getTh() {
		return th;
	}
	public void setTh(List<TheatreAdmin> th) {
		this.th = th;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminEmail=" + adminEmail + ", password=" + password + ", theatre="
				+ theatre + ", th=" + th + "]";
	}
	
	
	
	

}
