package com.project.moviebooking.moviebooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.moviebooking.moviebooking.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {

}
