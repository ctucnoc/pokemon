package com.example.demo.pokemon.api;


import com.example.demo.models.DetalleResponse;
import com.example.demo.models.EvolutionChainResponse;
import com.example.demo.models.PokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIPokemon {

	@GET("pokemon-species")
	public Call<PokemonResponse> findAll();
	
	@GET("pokemon-species/{p}")
	public Call<DetalleResponse> detailByid(@Path("p") Integer p);
	
	@GET("evolution-chain/{p}")
	public Call<EvolutionChainResponse> findByEvolutionChain(@Path("p") Integer p);
}
