package com.project.moviebooking.moviebooking.Service;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.project.moviebooking.moviebooking.Dao.AdminDao;
import com.project.moviebooking.moviebooking.Dto.AdminDto;
import com.project.moviebooking.moviebooking.entity.Admin;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

@Service
public class AdminService {
	AdminDao admindao;
	public ResponseEntity<ResponseStructure<AdminDto>> saveadmin(Admin admin) {
		AdminDto adto=new AdminDto();
		ModelMapper m=new ModelMapper();
		ResponseStructure<AdminDto>structure=new ResponseStructure<AdminDto>();
		m.map(admindao.saveadmin(admin), adto);
		if(adto!=null) {
			structure.setMessage("admin save succesfully");
			structure.setStatus(HttpStatus.CREATED.value());
			structure.setData(adto);
			return new ResponseEntity<ResponseStructure<AdminDto>>(structure,HttpStatus.CREATED);
			
		}
		return null;
	}
	public ResponseEntity<ResponseStructure<AdminDto>> findadmin(int adminid){
		AdminDto adto=new AdminDto();
		ModelMapper m=new ModelMapper();
		ResponseStructure<AdminDto>structure=new ResponseStructure<AdminDto>();
		m.map(admindao.findadmin(adminid),adto);
		if(adto!=null) {
			structure.setMessage("admin id found succesffully");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(adto);
			return new ResponseEntity<ResponseStructure<AdminDto>>(structure,HttpStatus.NOT_FOUND);
			
		}
		return null;
	}
	public ResponseEntity<ResponseStructure<AdminDto>> deletedmin(int adminid) {
		AdminDto adto=new AdminDto();
		ModelMapper m=new ModelMapper();
		ResponseStructure<AdminDto>structure=new ResponseStructure<AdminDto>();
		m.map(admindao.deleteadmin(adminid), adto);
		if(adto!=null) {
			structure.setMessage("admin delete succesfully");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(adto);
			return new ResponseEntity<ResponseStructure<AdminDto>>(structure,HttpStatus.NOT_FOUND);
			
		}
		return null;
	}
	public ResponseEntity<ResponseStructure<AdminDto>> updateadmin( Admin admin,int adminid) {
		AdminDto adto=new AdminDto();
		ModelMapper m=new ModelMapper();
		ResponseStructure<AdminDto>structure=new ResponseStructure<AdminDto>();
		m.map(admindao.updateadmin(admin, adminid), adto);
		if(adto!=null) {
			structure.setMessage("admin upadted succesfully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(adto);
			return new ResponseEntity<ResponseStructure<AdminDto>>(structure,HttpStatus.OK);
			
		}
		return null;
	}
	
}
	
	
	
	
	


