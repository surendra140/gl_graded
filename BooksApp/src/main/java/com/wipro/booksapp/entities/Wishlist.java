package com.wipro.booksapp.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Wishlist {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String name;
	
	@OneToMany(mappedBy="wishlist")
	private Set<Books> books;
}
