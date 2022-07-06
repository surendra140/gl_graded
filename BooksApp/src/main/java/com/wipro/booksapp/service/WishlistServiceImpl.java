package com.wipro.booksapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.wipro.booksapp.entities.Wishlist;
import com.wipro.booksapp.repository.WishlistRepository;

@Service
public class WishlistServiceImpl implements IWishlistService {

	@Autowired
	WishlistRepository repo;
	
	
	@Override
	public Wishlist addWishlist(Wishlist wishlist) {
		// TODO Auto-generated method stub
		return repo.save(wishlist);
	}

}
