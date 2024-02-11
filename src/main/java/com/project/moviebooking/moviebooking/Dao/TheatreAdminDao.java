package com.project.moviebooking.moviebooking.Dao;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.project.moviebooking.moviebooking.entity.TheatreAdmin;

import com.project.moviebooking.moviebooking.repo.TheatreAdminRepo;
@Repository
public class TheatreAdminDao {
	TheatreAdminRepo threpo;
	public TheatreAdmin savetheatreadmin(TheatreAdmin th) {
		return threpo.save(th);
	}
	public TheatreAdmin findtheatreadmin(int TheatreAdminId) {
		Optional<TheatreAdmin> m=threpo.findById(TheatreAdminId);
		if(m.isPresent()) {
			return m.get();
		}
		return null;
		
	}
	public TheatreAdmin deletetheatreadmin(int TheatreAdminId) {
		TheatreAdmin m=findtheatreadmin(TheatreAdminId);
			if(m!=null) {
				threpo.delete(m);
				
			}
			return null;
		}
   public TheatreAdmin updatetheatre(TheatreAdmin m,int TheatreAdminId) {
	   TheatreAdmin m=findtheatreadmin(TheatreAdminId);
	   if(m!=null) {
		   m.setTheatreAdminid(TheatreAdminId);;
		   threpo.save(m);
	   }
	   return null;
   }
	   
		
	}

