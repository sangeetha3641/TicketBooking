package com.project.moviebooking.moviebooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.moviebooking.moviebooking.entity.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
