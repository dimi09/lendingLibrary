package com.libraryproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "book_table")
public class Book {

	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "book_id")
	private int id;
	
	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;


	public Book(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}


	public Book() {

	}


	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	

	

}
