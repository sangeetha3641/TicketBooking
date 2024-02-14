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

import com.project.moviebooking.moviebooking.Service.BookingService;
import com.project.moviebooking.moviebooking.entity.Booking;
@RestController
@RequestMapping("booking")
public class BookingController {
	@Autowired
	BookingService bookingservice;
	@PostMapping
	public  Booking savebooking(@RequestBody Booking booking){
		return bookingservice.savebooking(booking);
	}
	@GetMapping
	public Booking findbooking(@RequestParam int bookingid) {
		return bookingservice.findbooking(bookingid);
	}
	@DeleteMapping
	public Booking deletbooking(@RequestParam int bookingid) {
		return bookingservice.deletebooking(bookingid);
		
	}
	@PutMapping
	public Booking updatebooking(@RequestBody Booking booking,@RequestParam int  bookingid) {
		return bookingservice.updatbooking(booking, bookingid);
	}

}
