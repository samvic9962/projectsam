package com.surveybank.Servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surveybank.Exception.ResourceNotFoundException;
import com.surveybank.Repository.UserRepo;
import com.surveybank.Service.UserService;
import com.surveybank.entity.User;

@Service
public class UserImpl implements UserService {
	@Autowired
	UserRepo userRepo;
	
	public User login(String email, String password) {
		 User s = userRepo.findByEmail(email);
		 
		 if(s!=null) {
			 if(s.getPassword().equals(password)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}

	public User addUser(User user) {
		return  userRepo.save(user);
	}

	public User updateDb(String email,User user) {
		
		
		User s1 = userRepo.findByEmail(email);
		
		if(s1!=null) {
			s1.setName(user.getName());   
			s1.setPh_no(user.getPh_no());
			s1.setPassword(user.getPassword());
			s1.setAddress(user.getAddress());
			
		return userRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void delete(String email) {
	
		
		User s2 = userRepo.findByEmail(email);
		
		if(s2!=null) {
			userRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	


}
