package com.webservice.spring.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webservice.spring.domain.Hero;

@Repository
public interface HeroRepository extends CrudRepository<Hero, Integer>{
	
	Optional<Hero> findByName(String name);
}
