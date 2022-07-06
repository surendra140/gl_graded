package com.wipro.booksapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Admin {

	@Id
	private String username;
	
	private String password;
	
	
	
}
