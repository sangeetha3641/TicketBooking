package com.project.moviebooking.moviebooking.Service;

import java.util.List;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.TheatreAdminDao;
import com.project.moviebooking.moviebooking.Dao.TheatreDao;
import com.project.moviebooking.moviebooking.Dto.TheatreAdminDto;
import com.project.moviebooking.moviebooking.entity.Theatre;
import com.project.moviebooking.moviebooking.entity.TheatreAdmin;
import com.project.moviebooking.moviebooking.exceptionhandling.TheatreAdminNotFound;
import com.project.moviebooking.moviebooking.exceptionhandling.TheatreNotFound;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

@Service
public class TheatredminService {
	@Autowired
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
		throw new TheatreAdminNotFound("no student found");
		
		
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
		throw new TheatreAdminNotFound("no student found");
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
		throw new TheatreAdminNotFound("no student found");
	}
	public ResponseEntity<ResponseStructure<TheatreAdminDto>>updatetheatreadmin(TheatreAdmin th,int theatreadminid){
		TheatreAdminDto thdto=new TheatreAdminDto();
		ModelMapper m=new ModelMapper();
		ResponseStructure<TheatreAdminDto>structure=new ResponseStructure<TheatreAdminDto>();
		m.map(thdao.updatetheatreadmin(th, theatreadminid),thdto);
		if(thdto!=null) {
			structure.setMessage("update theatreadmin successfully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(thdto);
			return  new ResponseEntity<ResponseStructure<TheatreAdminDto>>(structure,HttpStatus.OK);
		}
		throw new TheatreAdminNotFound("no student found");
	}
	public ResponseEntity<ResponseStructure<TheatreAdminDto>> assignTheatreToTheatreAdmin(int theatreAdminId,int theatreId){
		TheatreAdminDto thdto=new TheatreAdminDto();
		TheatreDao tdao=new TheatreDao();
		ModelMapper mapper=new ModelMapper();
		TheatreAdmin tAdmin=thdao.findtheatreadmin(theatreAdminId);
		Theatre theatre= tdao.findtheatre(theatreId);
		if(tAdmin != null) {
			if(theatre != null) {
				tAdmin.setTheatre(theatre);
				mapper.map(thdao.updatetheatreadmin(tAdmin, theatreAdminId),thdto);
				ResponseStructure<TheatreAdminDto> structure=new ResponseStructure<TheatreAdminDto>();
				structure.setMessage("assign theatre to Theatre Admin success");
				structure.setStatus(HttpStatus .OK.value());
				structure.setData(thdto);
				return new ResponseEntity<ResponseStructure<TheatreAdminDto>>(structure,HttpStatus.OK);
			}
			else {
				throw new TheatreNotFound("theatre not assigned to the theatre admin because,theatre not found for the given id");
			}
			
		}
		throw new TheatreAdminNotFound("we can't assign theatre to theatre admin because,theatre Admin not found for the given id");
	}
	public ResponseEntity<ResponseStructure<TheatreAdmin>>theatreadminlogin(String theatreadminemail,String theatreadminpassword){
		List<TheatreAdmin> theatreAdmin=thdao.findall();
		for(TheatreAdmin tha:theatreAdmin) {
			if(tha.getTheatreAdminemail().equals(theatreadminemail))
			{
				if(tha.getTheatreAdminpassword().equals(theatreadminpassword)) {
					ResponseStructure<TheatreAdmin>Structure=new ResponseStructure<TheatreAdmin>() ;
					Structure.setMessage("theatre admin login successfull");
					Structure.setStatus(HttpStatus.FOUND.value());
					return new ResponseEntity<ResponseStructure<TheatreAdmin>>(Structure,HttpStatus.FOUND);
				}
				throw new TheatreAdminNotFound("theatre admin login unsuceesfull");
				
			}
		}
		return null;
	}

}
	
		
		
	
	


