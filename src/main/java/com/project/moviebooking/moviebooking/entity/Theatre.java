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
	private List<Movie> movie;
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
	public List<Movie> getMovie() {
		return movie;
	}
	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Theatre [theatreid=" + theatreid + ", theatreLocation=" + theatreLocation + ", theatreName="
				+ theatreName + ", movie=" + movie + "]";
	}
	

	
	

}
