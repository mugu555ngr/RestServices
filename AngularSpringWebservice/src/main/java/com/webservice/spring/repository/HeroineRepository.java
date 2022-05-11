package com.webservice.spring.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webservice.spring.domain.Heroine;



@Repository
public interface HeroineRepository extends CrudRepository<Heroine, Integer>{
	
	Optional<Heroine> findByName(String name);
}
