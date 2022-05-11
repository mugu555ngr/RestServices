package com.webservice.spring.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.webservice.spring.domain.Hero;
import com.webservice.spring.repository.HeroRepository;

// Testing that Integrate repository and database
@DataJpaTest
public class HeroRepositoryTest {

	@Autowired
	HeroRepository heroRepository;
	
	@Test
	public void testFindAllHero() {
		Hero hero = new Hero();
		hero.setId(1);
		hero.setName("HelloWorld");
		Hero savedHero = heroRepository.save(hero);
		
		assertEquals(hero.getName(), savedHero.getName());
	}
	
}
