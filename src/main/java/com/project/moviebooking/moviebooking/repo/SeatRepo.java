package com.project.moviebooking.moviebooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.moviebooking.moviebooking.entity.Seat;

public interface SeatRepo extends JpaRepository<Seat,Integer> {

}
