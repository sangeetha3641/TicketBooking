package com.project.moviebooking.moviebooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.moviebooking.moviebooking.Service.TheatreService;
import com.project.moviebooking.moviebooking.entity.Theatre;
@RestController
@RequestMapping
public class TheatreController {
	@Autowired
	TheatreService theatreservice;
	@PostMapping
	public Theatre savetheatre(Theatre theatre) {
		return theatreservice.savetheatre(theatre);
		
	}
	@GetMapping
	public Theatre findtheatre(int theatreid) {
		return theatreservice.findtheatre(theatreid);
	}
	@PutMapping
	public Theatre deletetheatre(int theatreid) {
		return theatreservice.deletetheatre(theatreid);
	}
	@DeleteMapping
	public Theatre updatetheatre(Theatre th,int theatreid) {
		return theatreservice.updatetheatre(th, theatreid);
	}

}
