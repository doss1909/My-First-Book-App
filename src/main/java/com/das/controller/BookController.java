package com.das.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.das.DTO.BookDTO;
import com.das.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/add")
	public ResponseEntity<?> addBook(@RequestBody BookDTO bookDto) {
		return new ResponseEntity<BookDTO>(bookService.addBook(bookDto),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllBooks() {
		return new ResponseEntity<List<BookDTO>>(bookService.getAllBooks(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteBookById(@PathVariable Integer id){
		
		String status = bookService.deleteBookById(id);
		
		return new ResponseEntity<String>(status,HttpStatus.OK);
		
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getBookById(@PathVariable Integer id){
		
		BookDTO book = bookService.getBookById(id);
		
		return new ResponseEntity<>(book,HttpStatus.OK);
		
	}
	
	
	
}
