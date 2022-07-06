package com.wipro.booksapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.booksapp.entities.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> {

}
