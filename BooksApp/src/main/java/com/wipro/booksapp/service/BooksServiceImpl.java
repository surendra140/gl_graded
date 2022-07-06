package com.wipro.booksapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.booksapp.entities.Books;
import com.wipro.booksapp.repository.BookRepository;

@Service
public class BooksServiceImpl implements IBooksService {

	@Autowired
	BookRepository bookrepo;
	
	@Override
	public Books addBooks(Books books) {
		// TODO Auto-generated method stub
		return bookrepo.save(books);
	}

}
