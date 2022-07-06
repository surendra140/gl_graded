package com.wipro.booksapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.booksapp.entities.Admin;
import com.wipro.booksapp.entities.User;
import com.wipro.booksapp.service.AdminService;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

	@Autowired
	AdminService service;

	
	@PostMapping("/register")
	public String addAdminInfo(@RequestBody Admin admin) {
		
		return service.addAdminDetails(admin);
	}
	
	
	
	@PostMapping("/login")
	public String login(@RequestBody Admin admin) {

		return service.login(admin.getUsername(), admin.getPassword());

	}

	@GetMapping("/logout")
	public String logoutDo(HttpServletRequest request, HttpServletResponse response) {

		return "Logout Successfully";
	}

}
