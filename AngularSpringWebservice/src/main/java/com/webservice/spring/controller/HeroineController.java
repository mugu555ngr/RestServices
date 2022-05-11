package com.webservice.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.spring.domain.Heroine;
import com.webservice.spring.domain.Heroine;
import com.webservice.spring.service.HeroineService;
import com.webservice.spring.service.HeroineService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HeroineController {
	@Autowired
	HeroineService HeroineService;
	
@GetMapping("/getHeroine")
public List<Heroine>getHeroine()
{
	System.out.println("Get Heroines called");
	return HeroineService.getHeroine();
}
@GetMapping("/getHeroineById/{HeroineId}")
public Heroine getHeroineById(@PathVariable String HeroineId) {
	return HeroineService.getHeroineById(HeroineId);
}

@GetMapping("/getHeroineByName/{HeroineName}")
public Heroine getHeroineByName(@PathVariable String HeroineName) {
	return HeroineService.getHeroineByName(HeroineName);
}


@PostMapping("/saveHeroine") 
public Heroine saveHeroine(@RequestBody Heroine Heroine) {
	return HeroineService.saveHeroine(Heroine);
}
}
