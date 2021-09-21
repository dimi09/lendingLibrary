package com.libraryproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryproject.entity.Book;
import com.libraryproject.repository.BookRepository;


@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	    // add a book
		public Book saveBook(Book book) {
			return repository.save(book);
		}

	
		//get all books by the requested author
		public List<Book> getBookByAuthor(String author) {
			return repository.findByAuthor(author);
		}

		// delete book
		public String deleteBook(int id) {
			repository.deleteById(id);
			return "deleted book " + id;
		}
	
}
