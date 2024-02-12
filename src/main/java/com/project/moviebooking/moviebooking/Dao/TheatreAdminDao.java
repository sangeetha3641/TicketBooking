package com.project.moviebooking.moviebooking.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.moviebooking.moviebooking.entity.TheatreAdmin;

import com.project.moviebooking.moviebooking.repo.TheatreAdminRepo;
@Repository
public class TheatreAdminDao {
	@Autowired
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
	   TheatreAdmin m1=findtheatreadmin(TheatreAdminId);
	   if(m1!=null) {
		   m.setTheatreAdminid(TheatreAdminId);;
		   threpo.save(m1);
	   }
	   return null;
   }
	   
		
	}

