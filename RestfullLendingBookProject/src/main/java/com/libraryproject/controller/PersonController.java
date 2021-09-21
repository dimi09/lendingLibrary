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

import com.libraryproject.entity.Person;
import com.libraryproject.service.PersonService;


@RequestMapping("/person")
@RestController
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	//add a Person
	@PostMapping
	public Person addPerson(@RequestBody Person person) { 
		return service.savePerson(person);
	 }
	

	
	// get all persons by the requested role
	@GetMapping("/person/{role}")
	public List<Person> findByRole (@PathVariable String role) {
		return service.getPersonByRole(role);
	}
	
	// get all persons by the requested tel number
		@GetMapping("/person/{telNumber}")
		public List<Person> findByTelNumber (@PathVariable int telNumber) {
			return service.getPersonByTelNumber(telNumber);
		}
	
	// delete person
	@DeleteMapping("person/{id}")
	public String deletePerson(@PathVariable int id) {
		return service.deletePerson(id);
	}
	
	
	
	
	
	
	
}
