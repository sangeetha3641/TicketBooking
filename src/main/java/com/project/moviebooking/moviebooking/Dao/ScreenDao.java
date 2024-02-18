package com.project.moviebooking.moviebooking.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.moviebooking.moviebooking.entity.Screen;
import com.project.moviebooking.moviebooking.repo.ScreenRepo;
@Repository
public class ScreenDao {
	@Autowired
	ScreenRepo screenrepo;
	public Screen saveScreen(Screen screen) {
		return screenrepo.save(screen);
		
	}
	public Screen findScreen(int screenid) {
		Optional<Screen>p=screenrepo.findById(screenid);
		if(p.isPresent()) {
			return p.get();
		}
		return null;
	}
	public Screen deletescreen(int screenid) {
		Screen screen=findScreen(screenid);
		if(screen!=null) {
			screenrepo.delete(screen);
			return screen;
			
		}
		return null;
	}
	public Screen updatescreen(Screen screen,int screenid) {
		Screen s=findScreen(screenid);
		if(s!=null) {
			s.setScreenid(screenid);
			return screenrepo.save(screen);
		}
		return null;
	}

}
