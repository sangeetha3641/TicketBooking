package com.project.moviebooking.moviebooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.moviebooking.moviebooking.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
//	@Query("select u from User u where u.userEmail=?1")
//	public User findByEmail(String userEmail);

}
