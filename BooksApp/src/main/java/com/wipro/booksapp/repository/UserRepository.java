package com.wipro.booksapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.booksapp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	
}
