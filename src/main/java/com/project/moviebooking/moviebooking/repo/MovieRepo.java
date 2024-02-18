package com.project.moviebooking.moviebooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.moviebooking.moviebooking.entity.Movie;
import com.project.moviebooking.moviebooking.entity.User;

public interface MovieRepo extends JpaRepository<Movie, Integer> {
	

}
