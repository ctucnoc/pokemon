package com.example.demo.service;


import com.example.demo.models.DetalleResponse;
import com.example.demo.models.EvolutionChainResponse;
import com.example.demo.models.PokemonResponse;

public interface PokemonService {
	
	public PokemonResponse findAll(int offset,int limit);
	
	public DetalleResponse detailById(Integer p);
	
	public EvolutionChainResponse findByEvolutionChain(Integer p);
}
