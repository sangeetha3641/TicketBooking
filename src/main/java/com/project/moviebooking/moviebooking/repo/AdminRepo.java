package com.project.moviebooking.moviebooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.moviebooking.moviebooking.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>  {

}
