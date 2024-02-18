package com.project.moviebooking.moviebooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.moviebooking.moviebooking.Service.ScreenService;
import com.project.moviebooking.moviebooking.entity.Screen;
import com.project.moviebooking.moviebooking.util.ResponseStructure;
@RestController
@RequestMapping("screen")
public class ScreenController {
	@Autowired
	ScreenService screenservice;
	@PostMapping
	public ResponseEntity<ResponseStructure<Screen>> savescreen(@RequestBody Screen screen) {
		return screenservice.savescreen(screen);
		
	}
	@GetMapping
	public ResponseEntity<ResponseStructure<Screen>> findscreen(@RequestParam int screenid) {
		return screenservice.findscreen(screenid);
	}
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Screen>> deletescreen(@RequestParam  int screenid) {
		return screenservice.deletescreen(screenid);
		
	}
	@PutMapping
	public ResponseEntity<ResponseStructure<Screen>> updatescreen(@RequestBody Screen screen,@RequestParam int screenid) {
		return screenservice.updatescreen(screen, screenid);
	}
	

}
