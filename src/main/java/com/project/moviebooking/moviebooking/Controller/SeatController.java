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
import org.springframework.web.service.annotation.PutExchange;

import com.project.moviebooking.moviebooking.Service.SeatService;
import com.project.moviebooking.moviebooking.entity.Seat;
import com.project.moviebooking.moviebooking.util.ResponseStructure;
@RestController
@RequestMapping("seat")
public class SeatController {
	@Autowired
	SeatService seatservice;
	@PostMapping
	public ResponseEntity<ResponseStructure<Seat>>saveseat(@RequestBody Seat seat){
		return seatservice.saveSeat(seat);
		
	}
	@GetMapping
	public ResponseEntity<ResponseStructure<Seat>>findseat(@RequestParam int seatid){
		return seatservice.findSeat(seatid);
		
	}
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Seat>>deleteseat(@RequestParam int seatid){
		return seatservice.deleteSeat(seatid);
		
	}
	@PutMapping
	public ResponseEntity<ResponseStructure<Seat>>updateseat(@RequestBody Seat seat,@RequestParam int seatid){
		return seatservice.updateSeat(seat, seatid);
	}
	
	

}
