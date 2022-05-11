package com.webservice.spring.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.webservice.spring.domain.Hero;

// ApplicationContext.xml, Junit and Spring Integrate
@SpringBootTest
@AutoConfigureMockMvc
public class HeroControllerTest {
	
	@Autowired
	ObjectMapper objectMapper; // Json to Java object and Java Object to Json
	
	@Autowired
	MockMvc movkMvc;

	@Test
	public void getHeroeById() throws Exception {
		movkMvc.perform(get("/getHeroById/1").contentType("application/json"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.id", is(1)))
		.andExpect(jsonPath("$.name", is("Hello")));
	}
	
	@Test
	public void getHeroes() throws Exception {
		movkMvc.perform(get("/getHeroes").contentType("application/json"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$[0].id", is(1)))
		.andExpect(jsonPath("$[0].name", is("Hello")));
	}
	
	@Test
	public void getHeroByName() throws Exception {
		// To convert the json string to java object and perform assertion
		MvcResult result = movkMvc.perform(get("/getHeroByName/World").contentType("application/json"))
		.andExpect(status().isOk()).andReturn();
		String actualJson = result.getResponse().getContentAsString();
		
		// Json to java object conversion
		Hero hero = objectMapper.readValue(actualJson, Hero.class);
		
		assertThat(hero.getId()).isEqualTo(1);
		//.andExpect(jsonPath("$.id", is(2)))
		//.andExpect(jsonPath("$.name", is("World")));
	}
	
	@Test
	public void saveHero() throws Exception {
		Hero hero = new Hero();
		hero.setId(7);
		hero.setName("Mahi");
		movkMvc.perform(post("/saveHero").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(hero)))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.id", is(7)))
		.andExpect(jsonPath("$.name", is("Mahi")));
	}
}
