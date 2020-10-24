package com.example.demo.pokemon.api;


import com.example.demo.models.DetalleResponse;
import com.example.demo.models.EvolutionChainResponse;
import com.example.demo.models.PokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIPokemon {

	@GET("pokemon-species")
	public Call<PokemonResponse> findAll(@Query("offset")int offset,@Query("limit")int limit);
	
	@GET("pokemon-species/{p}")
	public Call<DetalleResponse> detailByid(@Path("p") Integer p);
	
	@GET("evolution-chain/{p}")
	public Call<EvolutionChainResponse> findByEvolutionChain(@Path("p") Integer p);
}
