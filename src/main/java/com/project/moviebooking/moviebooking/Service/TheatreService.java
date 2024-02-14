package com.project.moviebooking.moviebooking.Service;

import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.TheatreDao;
import com.project.moviebooking.moviebooking.entity.Theatre;

@Service
public class TheatreService {
	TheatreDao thdao;
	public Theatre savetheatre(Theatre th) {
		return thdao.savetheatre(th);
		
	}
	public Theatre findtheatre(int theatreid) {
		return thdao.findtheatre(theatreid);
		
	}
	public Theatre deletetheatre(int theatreid) {
		return thdao.deletetheatre(theatreid);
	}
	public Theatre updatetheatre(Theatre th,int theatreid) {
		return thdao.updatetheatre(th, theatreid);
	}

}
