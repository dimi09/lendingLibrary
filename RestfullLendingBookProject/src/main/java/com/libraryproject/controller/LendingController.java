package com.libraryproject.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libraryproject.entity.Lending;
import com.libraryproject.service.LendingService;

@RequestMapping("/lending")
@RestController
public class LendingController {
	
	@Autowired
	private LendingService service;
	
	// add a Lending
	@PostMapping
	public Lending addUser(@RequestBody Lending lending) { 
		return service.saveLending(lending);
	 }
	

	
	// get all Lendings by the requested date
	@GetMapping("/lending/{lendingDate}")
	public List<Lending> findByDate (@PathVariable Date lendingDate) {
		return service.getLendingByDate(lendingDate);
	}
	
	// delete Lending
	@DeleteMapping("lending/{id}")
	public String deleteLending(@PathVariable int id) {
		return service.deleteLending(id);
	}
	

	}
	

