package com.project.moviebooking.moviebooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.moviebooking.moviebooking.entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {
	

}
