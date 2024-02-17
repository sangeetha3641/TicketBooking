package com.project.moviebooking.moviebooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.moviebooking.moviebooking.Dto.UserDto;
import com.project.moviebooking.moviebooking.Service.UserService;
import com.project.moviebooking.moviebooking.entity.User;
import com.project.moviebooking.moviebooking.util.ResponseStructure;
@RestController
@RequestMapping("user")
public class UserController  {
	@Autowired
	UserService userservice;
	@PostMapping
	public ResponseEntity<ResponseStructure<UserDto>>saveuser(User u){
		return userservice.saveuser(u);
		
	}
	@GetMapping
	public ResponseEntity<ResponseStructure<UserDto>>finduser(int userid){
		return userservice.finduser(userid);
	}
	@DeleteMapping
	public ResponseEntity<ResponseStructure<UserDto>>deleteuser(int userid){
		return userservice.deleteuser(userid);
	}
	@PutMapping
	public ResponseEntity<ResponseStructure<UserDto>>updateuser(User u,int userid){
		return userservice.updateuser(u, userid);
	}
	

}
