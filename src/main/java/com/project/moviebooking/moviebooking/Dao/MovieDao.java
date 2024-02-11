package com.project.moviebooking.moviebooking.Dao;

import java.util.Optional;

import com.project.moviebooking.moviebooking.entity.Movie;
import com.project.moviebooking.moviebooking.repo.MovieRepo;


public class MovieDao {
	MovieRepo movierepo;
	public Movie savemovie(Movie movie) {
		return movierepo.save(movie);
		
	}
	public Movie findmovie(int movieid) {
		Optional<Movie> m=movierepo.findById(movieid);
		if(m.isPresent()) {
			return m.get();
		}
		return null;
		
	}
	public Movie deletemovie(int movieid) {
		Movie m=findmovie(movieid);
			if(m!=null) {
				movierepo.delete(m);
				
			}
			return null;
		}
   public Movie updatemovie(Movie m,int movieid) {
	   Movie m=findmovie(movieid);
	   if(m!=null) {
		   m.setMovieId(movieid);
		   movierepo.save(m);
	   }
	   return null;
   }
	   
		
	}


