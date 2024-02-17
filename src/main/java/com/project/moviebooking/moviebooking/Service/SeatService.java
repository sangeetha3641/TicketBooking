package com.project.moviebooking.moviebooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.SeatDao;
import com.project.moviebooking.moviebooking.entity.Seat;
import com.project.moviebooking.moviebooking.exceptionhandling.SeatNotFound;
import com.project.moviebooking.moviebooking.util.ResponseStructure;
@Service
public class SeatService {
	@Autowired
	SeatDao sDao;
	public ResponseEntity<ResponseStructure<Seat>> saveSeat(Seat seat) {
	ResponseStructure<Seat> structure=new ResponseStructure<Seat>();
	structure.setMessage("seat save success");
	structure.setStatus(HttpStatus .CREATED.value());
	structure.setData(sDao.saveSeat(seat));
	return new ResponseEntity<ResponseStructure<Seat>>(structure,HttpStatus.CREATED);
	}
	public ResponseEntity<ResponseStructure<Seat>> findSeat(int seatId) {
		ResponseStructure<Seat> structure=new ResponseStructure<Seat>();
		Seat seat=sDao.findSeat(seatId);
		if(seat != null) {
		structure.setMessage("seat find success");
		structure.setStatus(HttpStatus .FOUND.value());
		structure.setData(seat);
		return new ResponseEntity<ResponseStructure<Seat>>(structure,HttpStatus.FOUND);
		}
	return null;
	}
	public ResponseEntity<ResponseStructure<Seat>> deleteSeat(int seatId) {
		ResponseStructure<Seat> structure=new ResponseStructure<Seat>();
		Seat seat=sDao.findSeat(seatId);
		if(seat != null) {
		structure.setMessage("seat delete success");
		structure.setStatus(HttpStatus .OK.value());
		structure.setData(sDao.deleteSeat(seatId));
		return new ResponseEntity<ResponseStructure<Seat>>(structure,HttpStatus.OK);
		}
		return null;
		
		
	}
	public ResponseEntity<ResponseStructure<Seat>> updateSeat(Seat seat,int seatId) {
		ResponseStructure<Seat> structure=new ResponseStructure<Seat>();
		Seat exSeat=sDao.updateSeat(seat,seatId);
		if(exSeat != null) {
		structure.setMessage("seat update success");
		structure.setStatus(HttpStatus .OK.value());
		structure.setData(exSeat);
		return new ResponseEntity<ResponseStructure<Seat>>(structure,HttpStatus.OK);
		}
		return null;
	}
		public ResponseEntity<ResponseStructure<List<Seat>>> findAllSeat() {
			ResponseStructure<List<Seat>> structure=new ResponseStructure<List<Seat>>();
			List<Seat> seatList=sDao.findAllSeat();
			structure.setMessage(" find all seat success");
			structure.setStatus(HttpStatus .FOUND.value());
			structure.setData(seatList);
			return new ResponseEntity<ResponseStructure<List<Seat>>>(structure,HttpStatus.FOUND);
		}
	}


