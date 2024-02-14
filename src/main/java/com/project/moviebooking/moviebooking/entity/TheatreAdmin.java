package com.project.moviebooking.moviebooking.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
@Component
public class TheatreAdmin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int TheatreAdminid;
	
	private String TheatreAdminname;
	private String TheatreAdminemail;
	private String TheatreAdminpassword;
	@OneToOne(cascade = CascadeType.ALL)
	private Theatre theatre;
	
	public int getTheatreAdminid() {
		return TheatreAdminid;
	}
	public void setTheatreAdminid(int theatreAdminid) {
		TheatreAdminid = theatreAdminid;
	}
	public String getTheatreAdminname() {
		return TheatreAdminname;
	}
	public void setTheatreAdminname(String theatreAdminname) {
		TheatreAdminname = theatreAdminname;
	}
	public String getTheatreAdminemail() {
		return TheatreAdminemail;
	}
	public void setTheatreAdminemail(String theatreAdminemail) {
		TheatreAdminemail = theatreAdminemail;
	}
	public String getTheatreAdminpassword() {
		return TheatreAdminpassword;
	}
	public void setTheatreAdminpassword(String theatreAdminpassword) {
		TheatreAdminpassword = theatreAdminpassword;
	}
	@Override
	public String toString() {
		return "TheatreAdmin [TheatreAdminid=" + TheatreAdminid + ", TheatreAdminname=" + TheatreAdminname
				+ ", TheatreAdminemail=" + TheatreAdminemail + ", TheatreAdminpassword=" + TheatreAdminpassword + "]";
	}
	

}
