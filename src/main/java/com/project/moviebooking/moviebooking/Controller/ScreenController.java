package com.project.moviebooking.moviebooking.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.moviebooking.moviebooking.Service.ScreenService;
import com.project.moviebooking.moviebooking.entity.Screen;
@RestController
@RequestMapping("screen")
public class ScreenController {
	ScreenService screenservice;
	@PostMapping
	public Screen savescreen(Screen screen) {
		return screenservice.savescreen(screen);
		
	}
	@GetMapping
	public Screen findscreen(int screenid) {
		return screenservice.findscreen(screenid);
	}
	@DeleteMapping
	public Screen deletescreen(int screenid) {
		return screenservice.deletescreen(screenid);
		
	}
	@PutMapping
	public Screen updatescreen(Screen screen,int screenid) {
		return screenservice.updatescreen(screen, screenid);
	}
	

}
