package com.project.moviebooking.moviebooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.moviebooking.moviebooking.Dto.TheatreAdminDto;
import com.project.moviebooking.moviebooking.Service.TheatredminService;
import com.project.moviebooking.moviebooking.entity.TheatreAdmin;
import com.project.moviebooking.moviebooking.util.ResponseStructure;
@RestController
@RequestMapping("theatreadmin")
public class TheatreAdminController {
	@Autowired
	TheatredminService theatreadminservice;
	@PostMapping
	public ResponseEntity<ResponseStructure<TheatreAdminDto>> savetheatreadmin(TheatreAdmin th){
		return theatreadminservice.savetheatreadmin(th);
		
	}
	@PutMapping
	public ResponseEntity<ResponseStructure<TheatreAdminDto>>findtheatreadmin(int theatreadminid){
		return theatreadminservice.findtheatreadmin(theatreadminid);
	}
	@DeleteMapping
	public ResponseEntity<ResponseStructure<TheatreAdminDto>>deletetheatreadmin(int theatreadminid){
		return theatreadminservice.deletetheatreadmin(theatreadminid);
	}
	@PutMapping
	public ResponseEntity<ResponseStructure<TheatreAdminDto>>updatetheatreadmin(TheatreAdmin th,int theatreadminid){
		return theatreadminservice.updatetheatreadmin(th, theatreadminid);
	}

}
