package com.project.moviebooking.moviebooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.moviebooking.moviebooking.entity.Booking;

public interface Bookingrepo  extends JpaRepository<Booking, Integer>{

}
