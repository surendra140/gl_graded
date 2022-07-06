package com.wipro.booksapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.booksapp.entities.Wishlist;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

}
