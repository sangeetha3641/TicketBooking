package com.project.moviebooking.moviebooking.Controller;

import org.springframework.http.ResponseEntity;

import com.project.moviebooking.moviebooking.Dto.UserDto;
import com.project.moviebooking.moviebooking.Service.UserService;
import com.project.moviebooking.moviebooking.entity.User;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

public class UserController {
	UserService userservice;
	public ResponseEntity<ResponseStructure<UserDto>>saveuser(User u){
		return userservice.saveuser(u);
		
	}
	public ResponseEntity<ResponseStructure<UserDto>>finduser(int userid){
		return userservice.finduser(userid);
	}
	public ResponseEntity<ResponseStructure<UserDto>>deleteuser(int userid){
		return userservice.deleteuser(userid);
	}
	public ResponseEntity<ResponseStructure<UserDto>>updateuser(User u,int userid){
		return userservice.updateuser(u, userid);
	}
	

}
