package com.sdz.voiture;

import com.sdz.service.Marque;
import com.sdz.service.Vehicule;

public class Lagouna extends Vehicule {

	public Lagouna() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNom() {
		return "Lagouna";
	}
	
	public Marque getNomMarque() {
		return Marque.RENO;
	}

	@Override
	public String toString() {
		return getNomMarque() + ": Lagouna " +  moteur + ", options=" + options +" avec un prix total "+ getPrix() ;
	}

	
}
