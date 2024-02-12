package com.project.moviebooking.moviebooking.Dao;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.project.moviebooking.moviebooking.entity.Theatre;

import com.project.moviebooking.moviebooking.repo.TheatreRepo;
@Repository
public class TheatreDao {
	TheatreRepo theatrerepo;
	public Theatre savetheatre(Theatre theatre) {
		return theatrerepo.save(theatre);
		
		
	}
	public Theatre findtheatre(int TheatreId) {
		Optional<Theatre> t=theatrerepo.findById(TheatreId);
		if(t.isPresent()) {
			return t.get();
		}
		return null;
	}
	public Theatre deletetheatre(int TheatreId) {
		Theatre t=findtheatre(TheatreId);
			if(t!=null) {
				theatrerepo.delete(t);
				return t; 
			}
			return null;
		}
	
	public Theatre updatetheatre(Theatre theatre,int TheatreId) {
		Theatre t=findtheatre(TheatreId);
		if(t!=null) {
			t.setTheatreid(TheatreId);
			return theatrerepo.save(theatre);
		}
		return null;
	}
	
	
	

}
