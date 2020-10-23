package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.PokemonService;

@SpringBootTest
class PokemonAppApplicationTests {
	
	@Autowired
	private PokemonService pokemonService;

	@Test
	void contextLoads() {
		this.pokemonService.detailById(2);
	}

}
