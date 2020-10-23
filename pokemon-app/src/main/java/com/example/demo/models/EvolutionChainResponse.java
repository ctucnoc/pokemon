package com.example.demo.models;

public class EvolutionChainResponse {
	private String baby_trigger_item;
	private EvolvesTo chain;
	private String id;
	public String getBaby_trigger_item() {
		return baby_trigger_item;
	}
	public void setBaby_trigger_item(String baby_trigger_item) {
		this.baby_trigger_item = baby_trigger_item;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public EvolvesTo getChain() {
		return chain;
	}
	public void setChain(EvolvesTo chain) {
		this.chain = chain;
	}
	
	
}
