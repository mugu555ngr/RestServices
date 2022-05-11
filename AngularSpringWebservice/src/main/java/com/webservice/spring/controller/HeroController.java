package com.webservice.spring.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.spring.domain.Hero;
import com.webservice.spring.service.HeroService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HeroController {
	@Autowired
	HeroService heroService;
	
	@GetMapping("/getHeroes")
	public List<Hero> getHeroes() {
		System.out.println("Get Heroes Called");
		return heroService.getHeroes();
	}
	
	@GetMapping("/getHeroById/{heroId}")
	public Hero getHeroById(@PathVariable String heroId) {
		System.out.println("getHeroById");
		return heroService.getHeroById(heroId);
	}
	
	@GetMapping("/getHeroByName/{heroName}")
	public Hero getHeroByName(@PathVariable String heroName) {
		System.out.println("getHeroByName");
		return heroService.getHeroByName(heroName);
	}
	
	
	@PostMapping("/saveHero") 
	public Hero saveHero(@RequestBody Hero hero) {
		if(hero != null) {
			System.out.println("The value of save requet : id = "+hero.getId()+" and name = "+hero.getName());
		}
		return heroService.saveHero(hero);
	}
}