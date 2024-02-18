package com.project.moviebooking.moviebooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.moviebooking.moviebooking.entity.Screen;


public interface ScreenRepo extends JpaRepository<Screen, Integer> {
	

}
