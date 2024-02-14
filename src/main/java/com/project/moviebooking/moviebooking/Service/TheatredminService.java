package com.project.moviebooking.moviebooking.Service;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.TheatreAdminDao;
import com.project.moviebooking.moviebooking.Dto.TheatreAdminDto;
import com.project.moviebooking.moviebooking.entity.TheatreAdmin;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

@Service
public class TheatredminService {
	TheatreAdminDao thdao;
	public ResponseEntity<ResponseStructure<TheatreAdminDto>>savetheatreadmin(TheatreAdmin th){
		TheatreAdminDto thdto=new TheatreAdminDto();
		ModelMapper m=new ModelMapper();
		ResponseStructure<TheatreAdminDto>structure=new ResponseStructure<TheatreAdminDto>();
		m.map(thdao.savetheatreadmin(th),thdto );
		if(thdto!=null) {
			structure.setMessage("theatreadmin is saved successfully");
			structure.setStatus(HttpStatus.CREATED.value());
			structure.setData(thdto);
			return  new ResponseEntity<ResponseStructure<TheatreAdminDto>>(structure,HttpStatus.CREATED);
		}
		return null;
		
		
	}
	public ResponseEntity<ResponseStructure<TheatreAdminDto>>findtheatreadmin(int theatreadminid){
		TheatreAdminDto thdto=new TheatreAdminDto();
		ModelMapper m=new ModelMapper();
		ResponseStructure<TheatreAdminDto>structure=new ResponseStructure<TheatreAdminDto>();
		m.map(thdao.findtheatreadmin(theatreadminid),thdto );
		if(thdto!=null) {
			structure.setMessage("find theatreadmin successfully");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(thdto);
			return  new ResponseEntity<ResponseStructure<TheatreAdminDto>>(structure,HttpStatus.NO_CONTENT);
		}
		return null;
	}
	public ResponseEntity<ResponseStructure<TheatreAdminDto>>deletetheatreadmin(int theatreadminid){
		TheatreAdminDto thdto=new TheatreAdminDto();
		ModelMapper m=new ModelMapper();
		ResponseStructure<TheatreAdminDto>structure=new ResponseStructure<TheatreAdminDto>();
		m.map(thdao.deletetheatreadmin(theatreadminid),thdto );
		if(thdto!=null) {
			structure.setMessage("delete theatreadmin successfully");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(thdto);
			return  new ResponseEntity<ResponseStructure<TheatreAdminDto>>(structure,HttpStatus.NO_CONTENT);
		}
		return null;
	}
	public ResponseEntity<ResponseStructure<TheatreAdminDto>>updatetheatreadmin(TheatreAdmin th,int theatreadminid){
		TheatreAdminDto thdto=new TheatreAdminDto();
		ModelMapper m=new ModelMapper();
		ResponseStructure<TheatreAdminDto>structure=new ResponseStructure<TheatreAdminDto>();
		m.map(thdao.updatetheatre(th, theatreadminid),thdto );
		if(thdto!=null) {
			structure.setMessage("delete theatreadmin successfully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(thdto);
			return  new ResponseEntity<ResponseStructure<TheatreAdminDto>>(structure,HttpStatus.OK);
		}
		return null;
	}
}
	
		
		
	
	


