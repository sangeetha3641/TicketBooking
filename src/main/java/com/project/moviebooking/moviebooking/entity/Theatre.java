package com.project.moviebooking.moviebooking.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@Component
public class Theatre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int theatreid;
	private String theatreLocation;
	private String  theatreName;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Screen> screen;
	public int getTheatreid() {
		return theatreid;
	}
	public void setTheatreid(int theatreid) {
		this.theatreid = theatreid;
	}
	public String getTheatreLocation() {
		return theatreLocation;
	}
	public void setTheatreLocation(String theatreLocation) {
		this.theatreLocation = theatreLocation;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public List<Screen> getScreen() {
		return screen;
	}
	public void setScreen(List<Screen> screen) {
		this.screen = screen;
	}
	@Override
	public String toString() {
		return "Theatre [theatreid=" + theatreid + ", theatreLocation=" + theatreLocation + ", theatreName="
				+ theatreName + ", screen=" + screen + "]";
	}
	
	
	

}
