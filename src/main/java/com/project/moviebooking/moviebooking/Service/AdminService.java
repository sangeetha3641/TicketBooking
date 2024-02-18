package com.project.moviebooking.moviebooking.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.project.moviebooking.moviebooking.Dao.AdminDao;
import com.project.moviebooking.moviebooking.Dao.TheatreDao;
import com.project.moviebooking.moviebooking.Dto.AdminDto;
import com.project.moviebooking.moviebooking.entity.Admin;
import com.project.moviebooking.moviebooking.entity.Theatre;
import com.project.moviebooking.moviebooking.entity.TheatreAdmin;
import com.project.moviebooking.moviebooking.exceptionhandling.AdminNotfound;
import com.project.moviebooking.moviebooking.repo.TheatreAdminRepo;
import com.project.moviebooking.moviebooking.repo.TheatreRepo;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

public class AdminService {
	@Autowired
	TheatreRepo theatrerepo;
	@Autowired
	TheatreAdminRepo theatreAdminrepo;
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
		throw new AdminNotfound(" admin not found");
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
		throw new AdminNotfound("admin not found");
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
		throw new AdminNotfound("admin not  found");
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
		throw new AdminNotfound("admin not found");
	}
//	public ResponseEntity<ResponseStructure<AdminDto>> adminLogin(String adminMail,String adminPassword)
//	{
//		
//		AdminDto adminDto=new AdminDto();
//		ModelMapper modelMapper=new ModelMapper();
//		Admin admin=admindao.findbyemail(adminMail);
//		
//		ResponseStructure<AdminDto> structure=new ResponseStructure<AdminDto>();
//		if(admin!=null)
//		{
//			if(admin.getAdminEmail().equals(adminPassword))
//			{
//				modelMapper.map(admin, adminDto);
//			 structure.setData(adminDto);
//			 structure.setMessage("Admin login succesfully");
//			 structure.setStatus(HttpStatus.ACCEPTED.value());
//			 
//			 return new ResponseEntity<ResponseStructure<AdminDto>>(structure,HttpStatus.ACCEPTED);
//			} 
//			throw new AdminNotfound("admin password is not matching");
//			
//		}
//		return null;
//
	

//	public ResponseEntity<ResponseStructure<List<AdminDto>>>findalladmin()
//	{
//		List<Admin>adminlist=admindao.findall();
//		
//	}

// public ResponseEntity<ResponseStructure<AdminDto>> assignTheatresToAdmin(int adminId,List<Integer> theatreIds){
//	AdminDto aDto=new AdminDto();
//	TheatreDao tdao;
//	ModelMapper mapper=new ModelMapper();
//	Admin admin=admindao.findadmin(adminId);
//	if(admin != null) {
//		List<Theatre> extheatres=theatrerepo.findAllById(theatreIds);
//		admin.setTheatre(extheatres);
//		mapper.map(admindao.updateadmin(admin, adminId),aDto);
//		ResponseStructure<AdminDto> structure=new ResponseStructure<AdminDto>();
//		structure.setMessage("assign theatre to Admin success");
//		structure.setStatus(HttpStatus .OK.value());
//		structure.setData(aDto);
//		return new ResponseEntity<ResponseStructure<AdminDto>>(structure,HttpStatus.OK);
//	}
//	throw new AdminNotfound("we can't assign theatres to Admin because,Admin not found for the given id");
// }
 public ResponseEntity<ResponseStructure<AdminDto>>adminlogin(String adminemail,String adminpassword ){
	 List<Admin> admin=admindao.findall();
	 for(Admin a: admin) {
		 if(a.getAdminEmail().equals(adminemail))
		 {
			 if(a.getPassword().equals(adminpassword))
			 {
				 ResponseStructure<AdminDto>responseStructure=new ResponseStructure<AdminDto>();
				 responseStructure.setMessage("login successfull");
				 responseStructure.setStatus(HttpStatus.OK.value());
				 return new ResponseEntity<ResponseStructure<AdminDto>>(responseStructure,HttpStatus.OK);
			 }
			 return null;
		 }
		 return null;
	 }
	return null;
 }
 public ResponseEntity<ResponseStructure<AdminDto>> assignTheatrestooAdmin(String adminemail,String adminpassword,int adminId,List<Integer> theatreIds){
		ResponseEntity<ResponseStructure<AdminDto>> exadmin=adminlogin(adminemail, adminpassword);
		if(exadmin !=null) {
			AdminDto adto=new AdminDto();
		ModelMapper mapper=new ModelMapper();
		Admin admin=admindao.findadmin(adminId);
		if(admin != null) {
			List<Theatre> extheatres=theatrerepo.findAllById(theatreIds);
			admin.setTheatre(extheatres);;
			mapper.map(admindao.updateadmin(admin, adminId), admindao);
			ResponseStructure<AdminDto> structure=new ResponseStructure<AdminDto>();
			structure.setMessage("assign theatre to Admin success");
			structure.setStatus(HttpStatus .OK.value());
			structure.setData(adto);
			return new ResponseEntity<ResponseStructure<AdminDto>>(structure,HttpStatus.OK);
		}
		throw new AdminNotfound("we can't assign the theatre");
		}
		throw new AdminNotfound("admin login required");
	}
 public ResponseEntity<ResponseStructure<AdminDto>> assignTheatreAdmintooAdmin(String adminemail,String adminpassword,int adminId,List<Integer> theatreAdminid){
		ResponseEntity<ResponseStructure<AdminDto>> exadmin=adminlogin(adminemail, adminpassword);
		if(exadmin !=null) {
			AdminDto adto=new AdminDto();
		ModelMapper mapper=new ModelMapper();
		Admin admin=admindao.findadmin(adminId);
		if(admin != null) {
			List<TheatreAdmin> extheatres=theatreAdminrepo.findAllById(theatreAdminid);
			admin.setTh(extheatres);
			mapper.map(admindao.updateadmin(admin, adminId), admindao);
			ResponseStructure<AdminDto> structure=new ResponseStructure<AdminDto>();
			structure.setMessage("assign theatreAdmin to admin succesffuly");
			structure.setStatus(HttpStatus .OK.value());
			structure.setData(adto);
			return new ResponseEntity<ResponseStructure<AdminDto>>(structure,HttpStatus.OK);
		}
		throw new AdminNotfound("we can't assign theatreAdmin");
		}
		throw new AdminNotfound("admin login required");
	}
	 
 }
 



	
	
	
	


