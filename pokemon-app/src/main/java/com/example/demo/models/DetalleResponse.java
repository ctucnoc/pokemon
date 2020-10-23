package com.example.demo.models;

public class DetalleResponse {
	private GenericDate color;
	private String base_happiness;
	private String capture_rate;
	
	private GenericDate evolves_from_species;


	public String getBase_happiness() {
		return base_happiness;
	}

	public void setBase_happiness(String base_happiness) {
		this.base_happiness = base_happiness;
	}

	public String getCapture_rate() {
		return capture_rate;
	}

	public void setCapture_rate(String capture_rate) {
		this.capture_rate = capture_rate;
	}

	public GenericDate getEvolves_from_species() {
		return evolves_from_species;
	}

	public void setEvolves_from_species(GenericDate evolves_from_species) {
		this.evolves_from_species = evolves_from_species;
	}

	public GenericDate getColor() {
		return color;
	}

	public void setColor(GenericDate color) {
		this.color = color;
	}	

}
