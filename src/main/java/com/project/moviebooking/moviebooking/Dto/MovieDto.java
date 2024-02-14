package com.project.moviebooking.moviebooking.Dto;

public class MovieDto {
	private int MovieId;
	private int MovieName;
	public int getMovieId() {
		return MovieId;
	}
	public void setMovieId(int movieId) {
		MovieId = movieId;
	}
	public int getMovieName() {
		return MovieName;
	}
	public void setMovieName(int movieName) {
		MovieName = movieName;
	}
	@Override
	public String toString() {
		return "MovieDto [MovieId=" + MovieId + ", MovieName=" + MovieName + "]";
	}

}
