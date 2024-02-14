package com.project.moviebooking.moviebooking.Service;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.moviebooking.moviebooking.Dao.UserDao;
import com.project.moviebooking.moviebooking.Dto.UserDto;
import com.project.moviebooking.moviebooking.entity.User;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

@Service
public class UserService {
	UserDao userdao;
	public ResponseEntity<ResponseStructure<UserDto>>saveuser(User user) {
		UserDto udto=new UserDto();
		ResponseStructure<UserDto>m=new ResponseStructure<UserDto>();
		ModelMapper mapper=new ModelMapper();
		ResponseStructure<UserDto>structure=new ResponseStructure<UserDto>();
		mapper.map(userdao.saveuser(user), udto);
		if(udto!=null) {
			structure.setMessage("save data successully");
			structure.setStatus(HttpStatus.CREATED.value());
			structure.setData(udto);
			return  new ResponseEntity<ResponseStructure<UserDto>>(structure,HttpStatus.CREATED);
			
		}
		return null;
		
		}
	public ResponseEntity<ResponseStructure<UserDto>>finduser(int userid) {
		UserDto udto=new UserDto();
		ResponseStructure<UserDto>m=new ResponseStructure<UserDto>();
		ModelMapper mapper=new ModelMapper();
		ResponseStructure<UserDto>structure=new ResponseStructure<UserDto>();
		mapper.map(userdao.finduser(userid), udto);
		if(udto!=null) {
			structure.setMessage("save data successully");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(udto);
			return  new ResponseEntity<ResponseStructure<UserDto>>(structure,HttpStatus.NOT_FOUND);
			
		}
		return null;
	}
	public ResponseEntity<ResponseStructure<UserDto>>deleteuser(int userid) {
		UserDto udto=new UserDto();
		ResponseStructure<UserDto>m=new ResponseStructure<UserDto>();
		ModelMapper mapper=new ModelMapper();
		ResponseStructure<UserDto>structure=new ResponseStructure<UserDto>();
		mapper.map(userdao.deleteuser(userid), udto);
		if(udto!=null) {
			structure.setMessage("save data successully");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(udto);
			return  new ResponseEntity<ResponseStructure<UserDto>>(structure,HttpStatus.NOT_FOUND);
			
		}
		return null;
	}
	public ResponseEntity<ResponseStructure<UserDto>>updateuser(User user,int userid) {
		UserDto udto=new UserDto();
		ResponseStructure<UserDto>m=new ResponseStructure<UserDto>();
		ModelMapper mapper=new ModelMapper();
		ResponseStructure<UserDto>structure=new ResponseStructure<UserDto>();
		mapper.map(userdao.updateuser(user, userid), udto);
		if(udto!=null) {
			structure.setMessage("save data successully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(udto);
			return  new ResponseEntity<ResponseStructure<UserDto>>(structure,HttpStatus.OK);
			
		}
		return null;
		}
	
	

}
