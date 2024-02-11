package com.project.moviebooking.moviebooking.Dao;

import java.util.Optional;

import com.project.moviebooking.moviebooking.entity.Screen;
import com.project.moviebooking.moviebooking.repo.ScreenRepo;

public class ScreenDao {
	ScreenRepo screenrepo;
	public Screen saveScreen(Screen screen) {
		return screenrepo.save(screen);
		
	}
	public Screen findScreen(int screenNumber) {
		Optional<Screen>p=screenrepo.findById(screenNumber);
		if(p.isPresent()) {
			return p.get();
		}
		return null;
	}
	public Screen deletescreen(int screenNumber) {
		Screen screen=findScreen(screenNumber);
		if(screen!=null) {
			screenrepo.delete(screen);
			return screen;
			
		}
		return null;
	}
	public Screen updatescreen(Screen screen,int screenNumber) {
		Screen s=findScreen(screenNumber);
		if(s!=null) {
			s.setScreenNumber(screenNumber);
			return screenrepo.save(screen);
		}
		return null;
	}

}
