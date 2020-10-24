package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.models.DetalleResponse;
import com.example.demo.models.EvolutionChainResponse;
import com.example.demo.models.PokemonResponse;
import com.example.demo.service.PokemonService;
import com.example.demo.util.Util;

@Controller
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;

	@GetMapping("/findAll")
	public String findAll(Model model,@RequestParam(value = "offset",required = true)int offset,@RequestParam(value = "limit",required = true)int limit) {
		PokemonResponse response=this.pokemonService.findAll(offset, limit);		
		model.addAttribute("listPokemon", response.getResults());			
		return "listPokemon";
	}
	
	@GetMapping("/detail")
	public String detailById(Model model,@RequestParam(value = "p",required = true)Integer p) {
		DetalleResponse detalleResponse=this.pokemonService.detailById(p);
		EvolutionChainResponse evolutionChainResponse=this.pokemonService.findByEvolutionChain(detalleResponse.getEvolution_chain().getNumber());
		List<String> list=Util.convertStringToBoolean(evolutionChainResponse);
		System.out.println(list.size());
		model.addAttribute("list", list);
		model.addAttribute("urlImg", "https://pokeres.bastionbot.org/images/pokemon/"+p+".png");
		model.addAttribute("color", detalleResponse.getColor());
		model.addAttribute("capturaRate", detalleResponse.getCapture_rate());
		model.addAttribute("evolutionFromSpecie", detalleResponse.getEvolves_from_species());
		return "detailPokemon";
	}
}
