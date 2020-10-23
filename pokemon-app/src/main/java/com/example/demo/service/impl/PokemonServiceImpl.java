package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.DetalleResponse;
import com.example.demo.models.EvolutionChain;
import com.example.demo.models.EvolutionChainResponse;
import com.example.demo.models.PokemonResponse;
import com.example.demo.pokemon.api.APIClient;
import com.example.demo.pokemon.api.APIPokemon;
import com.example.demo.service.PokemonService;

@Service
public class PokemonServiceImpl implements PokemonService {

	@Override
	public PokemonResponse findAll() {
		try {
			APIPokemon apiPokemon = APIClient.getClient().create(APIPokemon.class);
			return apiPokemon.findAll().execute().body();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public DetalleResponse detailById(Integer p) {
		try {
			APIPokemon apiPokemon = APIClient.getClient().create(APIPokemon.class);
			return apiPokemon.detailByid(p).execute().body();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public EvolutionChainResponse findByEvolutionChain(Integer p) {
		try {
			APIPokemon apiPokemon = APIClient.getClient().create(APIPokemon.class);
			return apiPokemon.findByEvolutionChain(p).execute().body();
		} catch (Exception e) {
			return null;
		}
	}

}
