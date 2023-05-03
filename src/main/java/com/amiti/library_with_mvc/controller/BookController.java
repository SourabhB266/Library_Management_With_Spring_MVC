package com.amiti.library_with_mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amiti.library_with_mvc.dao.BookDao;
import com.amiti.library_with_mvc.dto.Book;

@RestController
public class BookController {

	@Autowired
	private BookDao dao;

	@CrossOrigin
	@PostMapping(value = "/saveBook", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		dao.saveBook(book);

		return new ResponseEntity<Book>(book, HttpStatus.OK);

	}

	@CrossOrigin
	@PostMapping(value = "/updateBook", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> updateBook(@RequestBody Book book) {
		dao.updateBook(book);
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}

	@CrossOrigin
	@GetMapping(value = "/getAllBooks", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> list = dao.getAllBooks();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@CrossOrigin
	@GetMapping(value = "/getBookById", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> getBookById(@RequestParam int id) {
		Book book = dao.getBookById(id);
		if (book != null) {
			return new ResponseEntity<>(book, HttpStatus.OK);
		} else {
			return new ResponseEntity<Book>(book, HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@DeleteMapping(value = "/deleteBook")
	public ResponseEntity<Book> deleteBook(@RequestParam int id) {
		Book book = dao.deleteBook(id);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}
}
