package com.project.moviebooking.moviebooking.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
@Component
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int MovieId;
	private String MovieName;
	@OneToOne
	private List<Review>review;
	public int getMovieId() {
		return MovieId;
	}
	public void setMovieId(int movieId) {
		MovieId = movieId;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public List<Review> getReview() {
		return review;
	}
	public void setReview(List<Review> review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "Movie [MovieId=" + MovieId + ", MovieName=" + MovieName + ", review=" + review + "]";
	}
	

}
