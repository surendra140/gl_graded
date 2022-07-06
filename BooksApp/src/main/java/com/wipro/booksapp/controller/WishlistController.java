package com.wipro.booksapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.booksapp.entities.Books;
import com.wipro.booksapp.entities.User;
import com.wipro.booksapp.entities.Wishlist;
import com.wipro.booksapp.service.BooksServiceImpl;
import com.wipro.booksapp.service.WishlistServiceImpl;


@RestController
@RequestMapping("/api/v1/wishlist")
public class WishlistController {

	@Autowired
	WishlistServiceImpl wishService;
	
	@Autowired
	BooksServiceImpl bookService;
	
	
	@GetMapping("/wishlist")
	public String addWishlist(Books books, Wishlist wishlist) {
		
		Wishlist wishlist1 = new Wishlist();
	    wishlist1.setName("myList");
	    
	    wishService.addWishlist(wishlist1);
	    
	    Books book1 = new Books();
	    book1.setBookname("Tived");
	    book1.setAuthorname("surendra");
	    book1.setPrice(100.23);
	    book1.setWishlist(wishlist1);
	    
	    Books book2 = new Books();
	    book2.setBookname("Tived2");
	    book2.setAuthorname("surendra2");
	    book2.setPrice(200.23);
	    book2.setWishlist(wishlist1);
	    
	    bookService.addBooks(book1);
	    bookService.addBooks(book2);
	    
		return "success";
	}
}
