package com.project.moviebooking.moviebooking.Dao;

import java.util.Optional;

import com.project.moviebooking.moviebooking.entity.User;
import com.project.moviebooking.moviebooking.repo.UserRepo;

public class UserDao {
	UserRepo Userrepo;
	public User saveuser(User user) {
		return Userrepo.save(user);
	}
	public User finduser(int Userid) {
		Optional<User> u=Userrepo.findById(Userid);
		if(u.isPresent()) {
			return u.get();
		}
		return null;
	}
	public User deleteuser(int userid) {
		User u=finduser(userid);
		if(u!=null) {
			Userrepo.delete(u);
		}
		return null;
	}
	public User updateuser(User user,int userid) {
		User u=finduser(userid);
		if(u!=null) {
			u.setUserid(userid);
			Userrepo.save(user);
		}
		return null;
	}

	
}