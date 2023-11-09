package com.eapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.eapp.model.Users;
import com.eapp.service.UsersService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/triv/admins")
public class AdminController {

	@Autowired
	public UsersService usersService;
	
	@DeleteMapping("delete-user") // by admin
	public ResponseEntity<Users> deleteUserByEmailHandler(@Valid @RequestBody String email) {
		
		 Users deletedAdmin = usersService.deleteUserByEmail(email);
		
		 return new ResponseEntity<Users>(deletedAdmin,HttpStatus.OK);
		 
	}
	
}
