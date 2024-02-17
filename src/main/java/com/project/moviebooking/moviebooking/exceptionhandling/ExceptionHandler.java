package com.project.moviebooking.moviebooking.exceptionhandling;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.project.moviebooking.moviebooking.util.ResponseStructure;
@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler{
	public ResponseEntity<ResponseStructure<String>> AdminNotFoundException(AdminNotfound ex)
	{
		 ResponseStructure<String> structure=new ResponseStructure<String>();
		 structure.setData(ex.getMessage());
		 structure.setMessage("Admin not found");
		 structure.setStatus(HttpStatus.NOT_FOUND.value());
		 return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<ResponseStructure<String>> BookingnotfoundException(bookingnotavailable ex)
	{
		 ResponseStructure<String> structure=new ResponseStructure<String>();
		 structure.setData(ex.getMessage());
		 structure.setMessage("Booking not found");
		 structure.setStatus(HttpStatus.NOT_FOUND.value());
		 return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<ResponseStructure<String>> movienotfound(Movienotfound ex)
	{
		 ResponseStructure<String> structure=new ResponseStructure<String>();
		 structure.setData(ex.getMessage());
		 structure.setMessage("movie not found ");
		 structure.setStatus(HttpStatus.NOT_FOUND.value());
		 return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<ResponseStructure<String>>ScreenNotFoundException(ScreenNotFound ex)
	{
		 ResponseStructure<String> structure=new ResponseStructure<String>();
		 structure.setData(ex.getMessage());
		 structure.setMessage("Screen not found");
		 structure.setStatus(HttpStatus.NOT_FOUND.value());
		 return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<ResponseStructure<String>> TheatreAdminNotFoundException(TheatreAdminNotFound ex)
	{
		 ResponseStructure<String> structure=new ResponseStructure<String>();
		 structure.setData(ex.getMessage());
		 structure.setMessage("TheatreAdmin not found");
		 structure.setStatus(HttpStatus.NOT_FOUND.value());
		 return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<ResponseStructure<String>> Theatrenotfound(TheatreNotFound ex)
	{
		 ResponseStructure<String> structure=new ResponseStructure<String>();
		 structure.setData(ex.getMessage());
		 structure.setMessage("theatre is not found");
		 structure.setStatus(HttpStatus.NOT_FOUND.value());
		 return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<ResponseStructure<String>> UserNotFound(UserNotFound ex)
	{
		 ResponseStructure<String> structure=new ResponseStructure<String>();
		 structure.setData(ex.getMessage());
		 structure.setMessage("User not found");
		 structure.setStatus(HttpStatus.NOT_FOUND.value());
		 return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<ResponseStructure<String>> ReviewNotFound(ReviewNotFound ex)
	{
		 ResponseStructure<String> structure=new ResponseStructure<String>();
		 structure.setData(ex.getMessage());
		 structure.setMessage("Review not found");
		 structure.setStatus(HttpStatus.NOT_FOUND.value());
		 return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<ResponseStructure<String>> SeatNotFound(ReviewNotFound ex)
	{
		 ResponseStructure<String> structure=new ResponseStructure<String>();
		 structure.setData(ex.getMessage());
		 structure.setMessage("Seat not found");
		 structure.setStatus(HttpStatus.NOT_FOUND.value());
		 return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
	
	

    
}
