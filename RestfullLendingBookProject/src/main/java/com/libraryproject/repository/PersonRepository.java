package com.libraryproject.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.libraryproject.entity.Lending;
import com.libraryproject.entity.Person;


public interface PersonRepository extends CrudRepository<Lending, Integer>{



	List<Person> findByRole(String role);

	Person save(Person person);

	List<Person> findByTelNumber(int telNumber);


	
}
