package com.project.moviebooking.moviebooking.Dao;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.moviebooking.moviebooking.entity.Admin;
import com.project.moviebooking.moviebooking.repo.AdminRepo;
@Repository
public class AdminDao {
	@Autowired
	AdminRepo adminrepo;
	public Admin saveadmin(Admin Admin) {
		return adminrepo.save(Admin);
		
	}
	public Admin findadmin(int  AdminId) {
		Optional<Admin> p=adminrepo.findById(AdminId);
		if(p.isPresent()) {
			return p.get();
			
		}
		return null;
		
		
		
	}
	public Admin deleteadmin(int AdminId) {
		Admin admin=findadmin(AdminId);
		if(admin!=null) {
			adminrepo.delete(admin);
			return admin;
			
		}
		return admin;
		
	}
	public Admin updateadmin( Admin admin,int AdminId) {
		Admin exadmin=findadmin(AdminId);
		if(exadmin!=null) {
			admin.setAdminId(AdminId);
			adminrepo.save(admin);
			return exadmin;
		}
		return null;
		
	}
//	public Admin findbyemail(String adminemail) {
//		return adminrepo.findbyemail(adminemail);
//	}
    public List<Admin>findall() {  
    	return adminrepo.findAll();
    }
    }
		
		
