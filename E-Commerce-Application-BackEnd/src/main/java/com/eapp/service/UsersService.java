package com.eapp.service;

import com.eapp.exception.DataNotFoundException;
import com.eapp.exception.DuplicateEmailException;
import com.eapp.exception.InputInvaildException;
import com.eapp.model.Users;

public interface UsersService {

	public Users registerUsers(Users user) throws DuplicateEmailException,InputInvaildException;
	
	public Users getUserByEmail(String email) throws DataNotFoundException,InputInvaildException;
	
	public Users deleteUserByEmail(String email) throws DataNotFoundException,InputInvaildException;
	 
	public Users updateUserDetails(Users user) throws DataNotFoundException,InputInvaildException;
	 
}
