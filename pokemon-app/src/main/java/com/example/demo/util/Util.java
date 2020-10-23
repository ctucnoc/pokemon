package com.example.demo.util;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.models.EvolutionChainResponse;
import com.example.demo.models.EvolvesTo;

public final class Util {

	public static List<String> convertStringToBoolean(EvolutionChainResponse evolutionChainResponse) {
		List<String> list=new ArrayList<String>();
		list.add(evolutionChainResponse.getChain().getSpecies().getName());
		List<EvolvesTo> listevo=evolutionChainResponse.getChain().getEvolves_to();
		return null;
	}
}
