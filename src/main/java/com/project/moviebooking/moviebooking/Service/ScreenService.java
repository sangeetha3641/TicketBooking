package com.project.moviebooking.moviebooking.Service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.MovieDao;
import com.project.moviebooking.moviebooking.Dao.ScreenDao;
import com.project.moviebooking.moviebooking.entity.Movie;
import com.project.moviebooking.moviebooking.entity.Screen;
import com.project.moviebooking.moviebooking.entity.Seat;
import com.project.moviebooking.moviebooking.entity.SeatType;
import com.project.moviebooking.moviebooking.entity.TheatreAdmin;
import com.project.moviebooking.moviebooking.exceptionhandling.ScreenNotFound;
import com.project.moviebooking.moviebooking.exceptionhandling.SeatNotFound;
import com.project.moviebooking.moviebooking.repo.MovieRepo;
import com.project.moviebooking.moviebooking.repo.SeatRepo;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

@Service
public class ScreenService {
	@Autowired
	ScreenDao screendao;
	@Autowired
	SeatRepo seatrepo;
	@Autowired
	MovieRepo movierepo;
	public ResponseEntity<ResponseStructure<Screen>> savescreen(Screen screen){
		ResponseStructure <Screen>structure=new ResponseStructure<Screen>();
		Screen l=screendao.saveScreen(screen);
		if(l!=null) {
			structure.setMessage("save data ssuccessfully");
			structure.setStatus(HttpStatus.CREATED.value());
			structure.setData(l);
			return new ResponseEntity<ResponseStructure<Screen>>(structure,HttpStatus.CREATED);
			//ResponseEntity<ResponseStructure<Screen>>(structure,HttpStatus.CREATED);
		}
		 throw new ScreenNotFound("screen is not avaiable");
		}
	public ResponseEntity<ResponseStructure<Screen>> findscreen(int screenid){
		ResponseStructure <Screen>structure=new ResponseStructure<Screen>();
		Screen l=screendao.findScreen(screenid);
		if(l!=null) {
			structure.setMessage("save data ssuccessfully");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(l);
			return new ResponseEntity<ResponseStructure<Screen>>(structure,HttpStatus.CREATED);
			//ResponseEntity<ResponseStructure<Screen>>(structure,HttpStatus.CREATED);
		}
		 throw new ScreenNotFound("screen is not avaiable");
		}
	public ResponseEntity<ResponseStructure<Screen>> deletescreen(int screenid){
		ResponseStructure <Screen>structure=new ResponseStructure<Screen>();
		Screen l=screendao.deletescreen(screenid);
		if(l!=null) {
			structure.setMessage("save data ssuccessfully");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(l);
			return new ResponseEntity<ResponseStructure<Screen>>(structure,HttpStatus.CREATED);
			//ResponseEntity<ResponseStructure<Screen>>(structure,HttpStatus.CREATED);
		}
		 throw new ScreenNotFound("screen is not avaiable");
		}
	public ResponseEntity<ResponseStructure<Screen>> updatescreen(Screen screen,int screenid){
		ResponseStructure <Screen>structure=new ResponseStructure<Screen>();
		Screen l=screendao.updatescreen(screen, screenid);
		if(l!=null) {
			structure.setMessage("save data ssuccessfully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(l);
			return new ResponseEntity<ResponseStructure<Screen>>(structure,HttpStatus.CREATED);
			//ResponseEntity<ResponseStructure<Screen>>(structure,HttpStatus.CREATED);
		}
		 throw new ScreenNotFound("screen is not avaiable");
		}
	public ResponseEntity<ResponseStructure<Screen>>assignseattoscreen(int screenid,List<Integer>seatid){
		ResponseStructure<Screen>structure=new ResponseStructure<Screen>();
		ModelMapper m=new ModelMapper();
		Screen s=new Screen();
		Screen exscreen=screendao.findScreen(screenid);
		if(exscreen!=null) {
			List<Seat> s1=seatrepo.findAllById(seatid);
			exscreen.setSeat(s1);
			m.map(screendao.updatescreen(exscreen, screenid), screendao);
			structure.setMessage("seat found for the screen");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(exscreen);
			return new ResponseEntity<ResponseStructure<Screen>>(structure,HttpStatus.OK);
		}
		throw new SeatNotFound("seat not assign to screen");
	}
	
	public  ResponseEntity<ResponseStructure<List<Seat>>> findSeatAvailability(int screenid,SeatType seatType) {
		Screen s=screendao.findScreen(screenid);
		if(s!= null) {
		List<Seat> seatList=s.getSeat();
		List<Seat> seatsList=new ArrayList<Seat>();
		for (Seat seat : seatList) {
			if(seat.isSeatAvailability()==true && seat.getSeatType()==seatType) {
				seatsList.add(seat);
			}
		}
		ResponseStructure<List<Seat>> structure=new ResponseStructure<List<Seat>>();
		structure.setMessage("find seat availability found success");
		structure.setStatus(HttpStatus .FOUND.value());
		structure.setData(seatsList);
		return new ResponseEntity<ResponseStructure<List<Seat>>>(structure,HttpStatus.FOUND);
		}
		throw new ScreenNotFound("you can't see the seat availability because,movie not found gor given movie id");
	}
			
			
		
	}
	
	
	
	
	

