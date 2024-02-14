package com.project.moviebooking.moviebooking.Service;

import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.MovieDao;
import com.project.moviebooking.moviebooking.entity.Movie;

@Service
public class MovieService {
	MovieDao moviedao;
	public Movie savemovie(Movie movie) {
		return moviedao.savemovie(movie);
		
	}
	public Movie findmovie(int movieid) {
		return moviedao.findmovie(movieid);
	}
	public Movie deletemovie(int movieid) {
		return moviedao.deletemovie(movieid);
	}
	public Movie updatemovie(Movie movie,int movieid) {
		return moviedao.updatemovie(movie, movieid);
	}

}
