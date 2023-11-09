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
@RequestMapping("/triv/users")
public class CustomerController {

	@Autowired
	public UsersService usersService;
	
	@PutMapping("/update-user")  // by admin and user both
	public ResponseEntity<Users> updateUserDetailsHandler(@Valid @RequestBody Users user) {
		
		Users updatedAdmin = usersService.updateUserDetails(user);
		
		return new ResponseEntity<>(updatedAdmin,HttpStatus.ACCEPTED);
	}
	
	
}
