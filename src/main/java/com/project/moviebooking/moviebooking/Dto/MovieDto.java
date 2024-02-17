package com.project.moviebooking.moviebooking.Dto;

public class MovieDto {
	private int MovieId;
	private String MovieName;
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
	@Override
	public String toString() {
		return "MovieDto [MovieId=" + MovieId + ", MovieName=" + MovieName + "]";
	}
	
	
}
