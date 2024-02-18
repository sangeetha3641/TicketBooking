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

import com.project.moviebooking.moviebooking.Service.TicketService;
import com.project.moviebooking.moviebooking.entity.Ticket;
import com.project.moviebooking.moviebooking.util.ResponseStructure;
@RestController
@RequestMapping("ticket")
public class TicketController {
	@Autowired
	TicketService ticketservice;
	@PostMapping
	public ResponseEntity<ResponseStructure<Ticket>>saveticket(@RequestBody Ticket ticket){
		return ticketservice.saveTicket(ticket);
		
	}
	@GetMapping
	public ResponseEntity<ResponseStructure<Ticket>>findticket( @RequestParam int ticketid){
		return ticketservice.findTicket(ticketid);
		
	}
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Ticket>>deleteticket(@RequestParam int ticketid){
		return ticketservice.deleteTicket(ticketid);
	}
	@PutMapping
	public ResponseEntity<ResponseStructure<Ticket>>updateticket(@RequestBody Ticket ticket,@RequestParam int ticketid){
		return ticketservice.updateTicket(ticket, ticketid);
	}
	

}
