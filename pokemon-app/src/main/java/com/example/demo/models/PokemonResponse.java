package com.example.demo.models;

import java.util.List;

public class PokemonResponse {

	private int nro_next;
	private String next;
	private List<Pokemon> results;

	public List<Pokemon> getResults() {
		return results;
	}

	public void setResults(List<Pokemon> results) {
		this.results = results;
	}

	public int getNro_next() {
		String[] urlPartes = next.split("=");
		return Integer.parseInt(urlPartes[urlPartes.length - 1]);
	}

	public void setNro_next(int nro_next) {
		this.nro_next = nro_next;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

}
