package com.libraryproject.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryproject.entity.Lending;
import com.libraryproject.repository.LendingRepository;

@Service
public class LendingService {

	@Autowired
	private LendingRepository repository;
	
	    // add a Lending
		public Lending saveLending(Lending lending) {
			return repository.save(lending);
		}

		//get all Lendings by the requested date
		public List<Lending> getLendingByDate(Date date) {
			return repository.findByDate(date);
		}

		// delete Lending
		public String deleteLending(int id) {
			repository.deleteById(id);
			return "deleted Lending " + id;
		}

		
	
}
