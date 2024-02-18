package com.project.moviebooking.moviebooking.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.MovieDao;
import com.project.moviebooking.moviebooking.Dao.ScreenDao;
import com.project.moviebooking.moviebooking.Dao.SeatDao;
import com.project.moviebooking.moviebooking.Dao.TicketDao;
import com.project.moviebooking.moviebooking.entity.Movie;
import com.project.moviebooking.moviebooking.entity.Payment;
import com.project.moviebooking.moviebooking.entity.Seat;
import com.project.moviebooking.moviebooking.entity.SeatType;
import com.project.moviebooking.moviebooking.entity.Ticket;
import com.project.moviebooking.moviebooking.repo.SeatRepo;
import com.project.moviebooking.moviebooking.repo.UserRepo;
import com.project.moviebooking.moviebooking.util.ResponseStructure;
@Service
public class TicketService {
	@Autowired
	TicketDao tDao;
	@Autowired
	ScreenService screenservice;
	@Autowired
	ScreenDao screendao;
	public ResponseEntity<ResponseStructure<Ticket>> saveTicket(Ticket ticket) {
		ResponseStructure<Ticket> structure=new ResponseStructure<Ticket>();
		structure.setMessage("Ticket save success");
		structure.setStatus(HttpStatus .CREATED.value());
		structure.setData(tDao.saveTicket(ticket));
		return new ResponseEntity<ResponseStructure<Ticket>>(structure,HttpStatus.CREATED);
	}
	public ResponseEntity<ResponseStructure<Ticket>> findTicket(int ticketId) {
		ResponseStructure<Ticket> structure=new ResponseStructure<Ticket>();
		Ticket ticket=tDao.findTicket(ticketId);
		if(ticket != null) {
		structure.setMessage("Ticket found success");
		structure.setStatus(HttpStatus .FOUND.value());
		structure.setData(ticket);
		return new ResponseEntity<ResponseStructure<Ticket>>(structure,HttpStatus.FOUND);
		}
		return null;
	}
	public ResponseEntity<ResponseStructure<Ticket>> deleteTicket(int ticketId) {
		ResponseStructure<Ticket> structure=new ResponseStructure<Ticket>();
		Ticket ticket=tDao.findTicket(ticketId);
		if(ticket != null) {
		structure.setMessage("Ticket Delete success");
		structure.setStatus(HttpStatus .OK.value());
		structure.setData(tDao.deleteTicket(ticketId));
		return new ResponseEntity<ResponseStructure<Ticket>>(structure,HttpStatus.OK);
		}
		return null;
	}
	public ResponseEntity<ResponseStructure<Ticket>> updateTicket(Ticket ticket,int ticketId) {
		ResponseStructure<Ticket> structure=new ResponseStructure<Ticket>();
		Ticket newTicket=tDao.updateTicket(ticket, ticketId);
		if(newTicket != null) {
		structure.setMessage("Ticket update success");
		structure.setStatus(HttpStatus .OK.value());
		structure.setData(newTicket);
		return new ResponseEntity<ResponseStructure<Ticket>>(structure,HttpStatus.OK);
		}
		return null;
	}


}
