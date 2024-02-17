package com.project.moviebooking.moviebooking.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.moviebooking.moviebooking.entity.Movie;
import com.project.moviebooking.moviebooking.repo.MovieRepo;

@Repository
public class MovieDao {
	@Autowired
	
	
		MovieRepo movierepo;
		public Movie savemovie(Movie movie) {
			return movierepo.save(movie);
			
		}
		public Movie findmovie(int movieId) {
			Optional<Movie> m=movierepo.findById(movieId);
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
		   Movie m1=findmovie(movieid);
		   if(m1!=null) {
			   m1.setMovieId(movieid);
			   movierepo.save(m1);
		   }
		   return null;
	   }
		   

}
