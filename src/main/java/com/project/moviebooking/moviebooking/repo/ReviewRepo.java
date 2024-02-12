package com.project.moviebooking.moviebooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.moviebooking.moviebooking.entity.Review;

public interface ReviewRepo  extends JpaRepository<Review, Integer>{

}
