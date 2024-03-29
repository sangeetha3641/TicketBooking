package com.project.moviebooking.moviebooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.moviebooking.moviebooking.Dto.AdminDto;
import com.project.moviebooking.moviebooking.Service.AdminService;
import com.project.moviebooking.moviebooking.entity.Admin;
import com.project.moviebooking.moviebooking.util.ResponseStructure;

import jakarta.validation.Valid;
@RestController
@RequestMapping("admin")
public class AdminController {
	@Autowired
	AdminService adminservice;
	@PostMapping
   public ResponseEntity<ResponseStructure<AdminDto>> saveadmin( @Valid @RequestBody Admin  admin,BindingResult result){
		System.out.println("save admin");
	   return adminservice.saveadmin(admin);
   }
	@GetMapping
   public ResponseEntity<ResponseStructure<AdminDto>> findadmin(@RequestParam int adminid){
	   return adminservice.findadmin(adminid);
   }
	@DeleteMapping
   public ResponseEntity<ResponseStructure<AdminDto>> deleteadmin(@RequestParam int adminid){
	   return adminservice.deletedmin(adminid);
   }
	@PutMapping
	
   public ResponseEntity<ResponseStructure<AdminDto>> updateadmin( @Valid @RequestBody Admin admin, @RequestParam int  adminid){
	   return adminservice.updateadmin(admin, adminid);
   }
	@PutMapping("theatretoadmin")
	public ResponseEntity<ResponseStructure<AdminDto>>assigntheatretoadmin(@RequestParam int  adminId,@RequestBody List<Integer> theatreIds){
		return adminservice.assigntheatresToAdmin(adminId, theatreIds);
		
	}
	@GetMapping("adminlogin")
	public ResponseEntity<ResponseStructure<AdminDto>> adminlogin( @Valid @RequestParam  String adminemail,@Valid@RequestParam String adminpassword){
		return adminservice.adminlogin(adminemail, adminpassword);
	}

}
