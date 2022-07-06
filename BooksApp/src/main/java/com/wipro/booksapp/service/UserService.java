package com.wipro.booksapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.booksapp.entities.User;
import com.wipro.booksapp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

	// add user details
	public String addUserDetails(User user) {

		if (!userRepo.existsById(user.getEmail())) {
			userRepo.save(user);
			return "User Added Successfully";
		} else {
			return "User Already Exists";
		}
	}

	// User login

	public String loginUserDetails(User user) {
		if (userRepo.existsById(user.getEmail())) {
			User us = userRepo.getById(user.getEmail());
			if (us.getPassword().equals(user.getPassword())) {
				return "Logged In Successfully";
			} else {
				return "Please Enter Correct Details";
			}
		} else {
			return "User Details Not Exists! ";
		}
	}
	
	
	// User logout 
	public String userLogout(String email) {
		 if(userRepo.existsById(email)) {
			   return "LogOut Sucessfully";
		   }else {
			   return "Please Enter Correct Details";
		   }
	}
}
