package com.project.moviebooking.moviebooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.moviebooking.moviebooking.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>  {

}
