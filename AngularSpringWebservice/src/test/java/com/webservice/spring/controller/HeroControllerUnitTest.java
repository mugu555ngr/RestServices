package com.webservice.spring.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.webservice.spring.domain.Hero;
import com.webservice.spring.service.HeroService;
import com.webservice.spring.service.HeroineService;

@WebMvcTest
public class HeroControllerUnitTest {
	
	@MockBean
	HeroService heroService;
	
	@MockBean
	HeroineService heroineService;
	
	@Autowired
	HeroController heroController;
	
	@Test
	public void getHeroes() {
		String id = "1";
		Hero hero = new Hero();
		hero.setId(1);
		hero.setName("Hello");
		Mockito.when(heroService.getHeroById(id)).thenReturn(hero);
		heroController.getHeroById(id);
		assertEquals("Hello", hero.getName());
	}

}
