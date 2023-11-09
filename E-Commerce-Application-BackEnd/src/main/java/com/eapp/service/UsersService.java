package com.eapp.service;

import com.eapp.exception.DataNotFoundException;
import com.eapp.exception.DuplicateEmailException;
import com.eapp.model.Users;

public interface UsersService {

	public Users registerUsers(Users user) throws DuplicateEmailException;
	
	public Users getCustomerByEmail(String email) throws DataNotFoundException;
	
	
	
}
