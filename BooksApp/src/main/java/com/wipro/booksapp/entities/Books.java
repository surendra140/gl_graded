package com.wipro.booksapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Books {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String bookname;
	private String authorname; 
	private double price;

	@ManyToOne
	@JoinColumn(name="wishlist_id")
	private Wishlist wishlist;
}
