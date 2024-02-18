package com.project.moviebooking.moviebooking.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.TheatreDao;
import com.project.moviebooking.moviebooking.entity.Movie;
import com.project.moviebooking.moviebooking.entity.Screen;
import com.project.moviebooking.moviebooking.entity.Theatre;
import com.project.moviebooking.moviebooking.exceptionhandling.TheatreNotFound;
import com.project.moviebooking.moviebooking.repo.ScreenRepo;
import com.project.moviebooking.moviebooking.repo.TheatreRepo;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

@Service
public class TheatreService {
	@Autowired
	TheatreDao thdao;
	TheatreRepo theatrerepo;
	ScreenRepo screenrepo;
	public ResponseEntity<ResponseStructure<Theatre>> savetheatre(Theatre theatre){
		ResponseStructure <Theatre>structure=new ResponseStructure<Theatre>();
		Theatre l=thdao.savetheatre(theatre);
		if(l!=null) {
			structure.setMessage("save data ssuccessfully");
			structure.setStatus(HttpStatus.CREATED.value());
			structure.setData(l);
			return new ResponseEntity<ResponseStructure<Theatre>>(structure,HttpStatus.CREATED);
			//ResponseEntity<ResponseStructure<Theatre>>(structure,HttpStatus.CREATED);
		}
		 throw new TheatreNotFound("theatre is not avaiable");
		}
	public ResponseEntity<ResponseStructure<Theatre>> findtheatre(int theatreid){
		ResponseStructure <Theatre>structure=new ResponseStructure<Theatre>();
		Theatre l=thdao.findtheatre(theatreid);
		if(l!=null) {
			structure.setMessage("save data ssuccessfully");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(l);
			return new ResponseEntity<ResponseStructure<Theatre>>(structure,HttpStatus.NOT_FOUND);
			//ResponseEntity<ResponseStructure<Theatre>>(structure,HttpStatus.CREATED);
		}
		 throw new TheatreNotFound("theatre is not avaiable");
		}
	public ResponseEntity<ResponseStructure<Theatre>> deletetheatre(int theatreid){
		ResponseStructure <Theatre>structure=new ResponseStructure<Theatre>();
		Theatre l=thdao.deletetheatre(theatreid);
		if(l!=null) {
			structure.setMessage("save data ssuccessfully");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(l);
			return new ResponseEntity<ResponseStructure<Theatre>>(structure,HttpStatus.NOT_FOUND);
			//ResponseEntity<ResponseStructure<Theatre>>(structure,HttpStatus.CREATED);
		}
		 throw new TheatreNotFound("theatre is not avaiable");
		}
	public ResponseEntity<ResponseStructure<Theatre>> updatetheatre(Theatre theatre ,int theatreid){
		ResponseStructure <Theatre>structure=new ResponseStructure<Theatre>();
		Theatre l=thdao.updatetheatre(theatre, theatreid);
		if(l!=null) {
			structure.setMessage("save data ssuccessfully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(l);
			return new ResponseEntity<ResponseStructure<Theatre>>(structure,HttpStatus.OK);
			//ResponseEntity<ResponseStructure<Theatre>>(structure,HttpStatus.CREATED);
		}
		 throw new TheatreNotFound("theatre is not avaiable");
		}
	public ResponseEntity<ResponseStructure<List<Theatre>>> findAllTheatre() {
		ResponseStructure<List<Theatre>> structure=new ResponseStructure<List<Theatre>>();
		structure.setMessage("find all theatre success");
		structure.setStatus(HttpStatus .FOUND.value());
		structure.setData(theatrerepo.findAll());
		return new ResponseEntity<ResponseStructure<List<Theatre>>>(structure,HttpStatus.FOUND);
	}
	public ResponseEntity<ResponseStructure<List<Theatre>>> assignscreentotheatre(int theatreid,List<Integer>screenid){
		ResponseStructure<Theatre>structure=new ResponseStructure<Theatre>();
		ModelMapper mapper=new ModelMapper();
		Theatre theatre=thdao.findtheatre(theatreid);
		if(theatre!=null) {
			List<Screen>s=screenrepo.findAllById(screenid);
			theatre.setScreen(s);
			thdao.updatetheatre(theatre, theatreid);
			structure.setMessage("screen assigned to theatres");
			structure.setStatus(theatreid);
			structure.setData(theatre);
			return new ResponseEntity<ResponseStructure<List<Theatre>>>(HttpStatus.OK);
			
			
			
		}
		return null;
		
	}

}

