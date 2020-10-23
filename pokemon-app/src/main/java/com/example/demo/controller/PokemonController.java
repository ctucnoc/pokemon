package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.models.DetalleResponse;
import com.example.demo.models.Pokemon;
import com.example.demo.service.PokemonService;

@Controller
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;

	@GetMapping("/findAll")
	public String findAll(Model model) {
		List<Pokemon> list=this.pokemonService.findAll().getResults();
		model.addAttribute("listPokemon", list);			
		return "listPokemon";
	}
	
	@GetMapping("/detail")
	public String detailById(Model model,@RequestParam(value = "p",required = true)Integer p) {
		DetalleResponse detalleResponse=this.pokemonService.detailById(p);
		model.addAttribute("urlImg", "https://pokeres.bastionbot.org/images/pokemon/"+p+".png");
		model.addAttribute("color", detalleResponse.getColor());
		model.addAttribute("capturaRate", detalleResponse.getCapture_rate());
		model.addAttribute("evolutionFromSpecie", detalleResponse.getEvolves_from_species());
		return "detailPokemon";
	}
}
