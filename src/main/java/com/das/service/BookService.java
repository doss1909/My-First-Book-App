package com.das.service;

import java.util.List;

import com.das.DTO.BookDTO;


public interface BookService {

	BookDTO addBook(BookDTO bookDto);
	
	String deleteBookById(Integer id);
		
	BookDTO getBookById(Integer id);
	
	List<BookDTO> getAllBooks();
	
}
