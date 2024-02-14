package com.project.moviebooking.moviebooking.Service;

import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.ScreenDao;
import com.project.moviebooking.moviebooking.entity.Screen;

@Service
public class ScreenService {
	ScreenDao screendao;
	public Screen savescreen(Screen screen) {
		return screendao.saveScreen(screen);
		
	}
	public Screen findscreen(int screenid) {
		return screendao.findScreen(screenid);
	}
	public Screen deletescreen(int screenid) {
		return screendao.deletescreen(screenid);
	}
	public Screen updatescreen(Screen screen,int screenid) {
		return screendao.updatescreen(screen, screenid);
	}
	
	
	

}
