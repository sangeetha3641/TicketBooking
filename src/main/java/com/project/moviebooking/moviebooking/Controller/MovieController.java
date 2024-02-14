package com.project.moviebooking.moviebooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.moviebooking.moviebooking.Dto.MovieDto;
import com.project.moviebooking.moviebooking.Service.MovieService;
import com.project.moviebooking.moviebooking.entity.Movie;
import com.project.moviebooking.moviebooking.util.ResponseStructure;
@RestController
@RequestMapping("movie")
public class MovieController {
	@Autowired
	MovieService movieservice;
	@PostMapping
	public ResponseEntity<ResponseStructure<MovieDto>> savemovie(@RequestBody Movie movie) {
		return movieservice.savemovie(movie);
	}
	public ResponseEntity<ResponseStructure<MovieDto>> findmovie(@RequestParam int movieid) {
		return movieservice.findmovie(movieid);
	}
	public ResponseEntity<ResponseStructure<MovieDto>> deletemovie(@RequestParam int movieid) {
		return movieservice.deletemovie(movieid);
		
	}
	public ResponseEntity<ResponseStructure<MovieDto>> updatemovie(@RequestBody Movie movie,@RequestParam int movieid) {
		return movieservice.updatemovie(movie, movieid);
	}

}
