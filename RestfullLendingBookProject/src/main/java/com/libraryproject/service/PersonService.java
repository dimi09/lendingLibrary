package com.libraryproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryproject.entity.Person;
import com.libraryproject.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;
	
	    // add a Person
		public Person savePerson(Person person) {
			return repository.save(person);
		}

	
		//get all persons by the requested role
		public List<Person> getPersonByRole(String role) {
			return repository.findByRole(role);
		}
		
		//get all persons by the requested tel number
				public List<Person> getPersonByTelNumber(int telNumber) {
					return repository.findByTelNumber(telNumber);
				}

		// delete people
		public String deletePerson(int id) {
			repository.deleteById(id);
			return "deleted person " + id;
		}
	
}
