package com.libraryproject.repository;

import java.util.Date;
import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.libraryproject.entity.Lending;

public interface LendingRepository extends CrudRepository<Lending, Integer>{

	List<Lending> findByDate(Date date);

	

	
}
