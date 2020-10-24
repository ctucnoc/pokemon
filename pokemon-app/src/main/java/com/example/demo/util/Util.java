package com.example.demo.util;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.models.EvolutionChainResponse;
import com.example.demo.models.EvolvesTo;

public final class Util {

	public static List<String> convertStringToBoolean(EvolutionChainResponse evolutionChainResponse) {
		List<String> list = new ArrayList<String>();
		EvolvesTo evolvesTo = evolutionChainResponse.getChain();
		while (evolvesTo != null) {
			list.add(evolvesTo.getSpecies().getName());
			if (evolvesTo.getEvolves_to().size() == 0) {
				evolvesTo = null;
				continue;
			}
			evolvesTo = evolvesTo.getEvolves_to().get(0);
		}
		return list;
	}
}
