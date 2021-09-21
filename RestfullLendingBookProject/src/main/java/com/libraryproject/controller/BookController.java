package com.libraryproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libraryproject.entity.Book;
import com.libraryproject.service.BookService;

@RequestMapping("/book")
@RestController
public class BookController {

	@Autowired
	private BookService service;

	// add a book
	@PostMapping
	public Book addUser(@RequestBody Book book) {
		return service.saveBook(book);
	}

	//
	@GetMapping("/book/{author}")
	public List<Book> findByAuthor(@PathVariable String author) {
		return service.getBookByAuthor(author);
	}

	// delete book
	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable int id) {
		return service.deleteBook(id);
	}

}
