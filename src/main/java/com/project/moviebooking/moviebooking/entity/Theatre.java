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
	private int Theatreid;
	public int getTheatreid() {
		return Theatreid;
	}
	public void setTheatreid(int theatreid) {
		Theatreid = theatreid;
	}
	private String TheatreLocation;
	private String  TheatreName;
	@ManyToOne(cascade = CascadeType.ALL)
	private TheatreAdmin theatreadmin;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Screen>screen;
	public String getTheatreLocation() {
		return TheatreLocation;
	}
	public void setTheatreLocation(String theatreLocation) {
		TheatreLocation = theatreLocation;
	}
	public String getTheatreName() {
		return TheatreName;
	}
	public void setTheatreName(String theatreName) {
		TheatreName = theatreName;
	}
	@Override
	public String toString() {
		return "Theatre [Theatreid=" + Theatreid + ", TheatreLocation=" + TheatreLocation + ", TheatreName="
				+ TheatreName + ", theatreadmin=" + theatreadmin + ", screen=" + screen + "]";
	}
	

	
	

}
