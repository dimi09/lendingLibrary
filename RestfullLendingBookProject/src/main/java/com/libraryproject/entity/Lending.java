package com.libraryproject.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "lending_table")
public class Lending {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "lending_id")
	private int id;

	@JoinColumn(name = "person_id")
	private int peopleId;

	@JoinColumn(name = "book_id")
	private int bookId;

	@Temporal(TemporalType.DATE)
	private Date lendingDate = new Date(System.currentTimeMillis());

	public Lending() {

	}

	public Lending(int id, int peopleId, int bookId, Date lendingDate) {
		super();
		this.id = id;
		this.peopleId = peopleId;
		this.bookId = bookId;
		this.lendingDate = lendingDate;
	}

	public Lending(int peopleId, int bookId, Date lendingDate) {
		super();
		this.peopleId = peopleId;
		this.bookId = bookId;
		this.lendingDate = lendingDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPeopleId() {
		return peopleId;
	}

	public void setPeopleId(int peopleId) {
		this.peopleId = peopleId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Date getLendingDate() {
		return lendingDate;
	}

	public void setLendingDate(Date lendingDate) {
		this.lendingDate = lendingDate;
	}

}
