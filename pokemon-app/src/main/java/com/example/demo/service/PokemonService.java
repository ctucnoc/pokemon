package com.example.demo.service;

import com.example.demo.models.DetalleResponse;
import com.example.demo.models.PokemonResponse;

public interface PokemonService {
	
	public PokemonResponse findAll();
	
	public DetalleResponse detailById(Integer p);
}
