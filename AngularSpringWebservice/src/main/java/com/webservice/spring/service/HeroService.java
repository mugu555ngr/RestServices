package com.webservice.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.spring.domain.Hero;
import com.webservice.spring.repository.HeroRepository;

@Service
public class HeroService {

	@Autowired
	public HeroRepository heroRepository;
	
	public List<Hero> getHeroes() {
		List<Hero> result = new ArrayList<Hero>();
		heroRepository.findAll().forEach(result::add);
		return result;
	}
	
	public Hero getHeroById(String heroId) {
		return heroRepository.findById(Integer.parseInt(heroId)).get();
	}
	
	public Hero getHeroByName(String heroName) {
		return heroRepository.findByName(heroName).get();
	}
	
	public Hero saveHero(Hero hero) {
		return heroRepository.save(hero);
	}
}
