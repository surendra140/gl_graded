package com.wipro.booksapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.booksapp.entities.Admin;
import com.wipro.booksapp.entities.User;
import com.wipro.booksapp.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository repo;

	// login
	public String login(String username, String password) {

		Admin user = repo.findByUsernameAndPassword(username, password);

		return "Logged In as admin";
	}

	// register admin

	public String addAdminDetails(Admin admin) {

		if (!repo.existsById(admin.getUsername())) {
			repo.save(admin);
			return "Admin Added Successfully";
		} else {
			return "Admin Already Exists";
		}
	}
}
