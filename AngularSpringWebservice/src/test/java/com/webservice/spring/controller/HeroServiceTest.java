package com.webservice.spring.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.webservice.spring.domain.Hero;
import com.webservice.spring.repository.HeroRepository;
import com.webservice.spring.service.HeroService;

@SpringBootTest
public class HeroServiceTest {

	@MockBean
	public HeroRepository heroRepository;
	
	@Autowired
	HeroService heroService;
	
	@Test
	public void getHeroById() {
		Hero hero = new Hero();
		hero.setId(1);
		hero.setName("Hello");
		Mockito.when(heroRepository.findById(1)).thenReturn(Optional.ofNullable(hero));
		Hero actualHero = heroService.getHeroById("1");
		assertEquals(hero.getName(),actualHero.getName());
	}
}
