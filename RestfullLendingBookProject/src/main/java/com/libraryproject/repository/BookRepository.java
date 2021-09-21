package com.libraryproject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.libraryproject.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

	List<Book> findByAuthor(String author);

	

	
}
