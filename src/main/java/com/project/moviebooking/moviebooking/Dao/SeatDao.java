package com.project.moviebooking.moviebooking.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.moviebooking.moviebooking.entity.Seat;
import com.project.moviebooking.moviebooking.repo.SeatRepo;
@Repository
public class SeatDao {
	@Autowired
	SeatRepo seatrepo;
	public Seat saveSeat(Seat seat){
		return seatrepo.save(seat);
	}
	public Seat findSeat(int seatId){
		Optional<Seat> opSeat=seatrepo.findById(seatId);
		if(opSeat.isPresent()) {
			return opSeat.get();
		}
		return null;
	}
	public Seat deleteSeat(int seatId){
		Seat seat=findSeat(seatId);
		seatrepo.delete(seat);
		return seat;
	}
	public Seat updateSeat(Seat seat,int seatId){
		Seat newSeat=findSeat(seatId);
		if(newSeat != null) {
			seat.setSeatId(seatId);
			return seatrepo.save(seat);
		}
		return null;
	}
	public List<Seat> findAllSeat() {
		return seatrepo.findAll();
	}
	


}
