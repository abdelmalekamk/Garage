package com.sdz.service;

import java.util.LinkedList;
import java.util.List;

public class Garage {

	protected List <Vehicule> voitures = new LinkedList<Vehicule> ();
	
	public void addVoiture (Vehicule voi) {
		voitures.add(voi);
	}

	@Override
	public String toString() {
		if (voitures.isEmpty()) {
			return "Aucune Voiture sauvgard�e !!! ";
		}
		else {
			return "Voiture " + voitures +" \n";
		} 
	}
	
	public void listeVoiture () {
		if (voitures.isEmpty()) {
			System.out.println("Aucune Voiture sauvgard�e !!! ");
		}
		else {
			for(Vehicule V : voitures) {
				System.out.println(V);
			}
		} 
	}
}
