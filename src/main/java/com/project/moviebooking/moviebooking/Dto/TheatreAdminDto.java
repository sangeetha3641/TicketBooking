package com.project.moviebooking.moviebooking.Dto;

import com.project.moviebooking.moviebooking.entity.Theatre;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;

public class TheatreAdminDto {
    private int TheatreAdminid;
	
	private String TheatreAdminname;
	private String TheatreAdminemail;
	@OneToOne
	private Theatre theatre;
	public int getTheatreAdminid() {
		return TheatreAdminid;
	}
	@Override
	public String toString() {
		return "TheatreAdminDto [TheatreAdminid=" + TheatreAdminid + ", TheatreAdminname=" + TheatreAdminname
				+ ", TheatreAdminemail=" + TheatreAdminemail + ", theatre=" + theatre + "]";
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
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

}
