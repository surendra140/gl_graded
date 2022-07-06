package com.wipro.booksapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.booksapp.entities.User;
import com.wipro.booksapp.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/registeruser")
	public String addUserInfo(@RequestBody User user) {
		
		return userService.addUserDetails(user);
	}
	
	@PostMapping("/loginuser")
	public String loginUser(@RequestBody User user) {
		
		return userService.loginUserDetails(user);
	}
	
	@GetMapping("/logout/{email}")
	public String userLogout(@PathVariable String email) {
		
		return userService.userLogout(email);
	}
}
