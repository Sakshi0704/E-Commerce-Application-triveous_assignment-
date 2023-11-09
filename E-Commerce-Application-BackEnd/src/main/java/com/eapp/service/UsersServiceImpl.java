
package com.eapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eapp.exception.DataNotFoundException;
import com.eapp.exception.DuplicateEmailException;
import com.eapp.model.Users;
import com.eapp.repository.UsersRepository;



@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersRepository usersRepo;
	

	@Override
	public Users getCustomerByEmail(String email) throws DataNotFoundException {
		
		Optional<Users> opt = usersRepo.findByEmail(email);
		
		if(!opt.isPresent()) {
			throw new DataNotFoundException("User doesn't found with email "+ email);
		}
		
		return opt.get();
	}


	@Override
	public Users registerUsers(Users user) throws DuplicateEmailException {

		Optional<Users> opt = usersRepo.findByEmail(user.getEmail());
		
		if(opt.isPresent()) {
			throw new DuplicateEmailException("With this email "+user.getEmail()+" "+user.getRole()+" already exits");
		}
		
		usersRepo.save(user);
		
		return user;
	}
	
	
	
	
	
}
