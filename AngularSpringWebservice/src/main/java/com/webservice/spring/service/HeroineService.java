package com.webservice.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.spring.domain.Heroine;
import com.webservice.spring.repository.HeroineRepository;

@Service
public class HeroineService {

	@Autowired
	HeroineRepository heroineRepository;
	
	public List<Heroine> getHeroine(){
		List<Heroine> result=new ArrayList<Heroine>();
		return result;
	}
	public Heroine getHeroineById(String heroineId) {
		return heroineRepository.findById(Integer.parseInt(heroineId)).get();
	}
	public Heroine getHeroineByName(String heroineName) {
		return heroineRepository.findByName(heroineName).get();
	}
	
	@Transactional
	public Heroine saveHeroine(Heroine heroine) {
		Heroine heroineLocal = heroineRepository.save(heroine);
		return heroineLocal;
	}
	
}
