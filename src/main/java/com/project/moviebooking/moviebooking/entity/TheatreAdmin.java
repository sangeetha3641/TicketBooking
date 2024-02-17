package com.project.moviebooking.moviebooking.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Component
public class TheatreAdmin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int theatreAdminid;
	
	private String theatreAdminname;
	@NotNull(message="admin emailcannot be null")
	@NotBlank(message="admin email cannot be blank")
	@Email(message="enter a valid email address")
	private String theatreAdminemail;
	@NotNull(message="password cannot be null")
	@NotBlank(message="password cannot be null")
	@Size(min=8,message="password must be atleast 8 characters")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$",
	         message="password must be atleast 1 digit,1 uppercase,1 lowercase and 1 special character")
	private String theatreAdminpassword;
	@OneToOne(cascade = CascadeType.ALL)
	private Theatre theatre;
	
	public int getTheatreAdminid() {
		return theatreAdminid;
	}
	public void setTheatreAdminid(int theatreAdminid) {
		theatreAdminid = theatreAdminid;
	}
	public String getTheatreAdminname() {
		return theatreAdminname;
	}
	public void setTheatreAdminname(String theatreAdminname) {
		theatreAdminname = theatreAdminname;
	}
	public String getTheatreAdminemail() {
		return theatreAdminemail;
	}
	public void setTheatreAdminemail(String theatreAdminemail) {
		theatreAdminemail = theatreAdminemail;
	}
	public String getTheatreAdminpassword() {
		return theatreAdminpassword;
	}
	public void setTheatreAdminpassword(String theatreAdminpassword) {
		theatreAdminpassword = theatreAdminpassword;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	@Override
	public String toString() {
		return "TheatreAdmin [TheatreAdminid=" + theatreAdminid + ", TheatreAdminname=" + theatreAdminname
				+ ", TheatreAdminemail=" + theatreAdminemail + ", TheatreAdminpassword=" + theatreAdminpassword + "]";
	}
	

}
