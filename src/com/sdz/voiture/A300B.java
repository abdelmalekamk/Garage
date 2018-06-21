package com.sdz.voiture;

import com.sdz.service.Marque;
import com.sdz.service.Vehicule;

public class A300B extends Vehicule {
	
	public A300B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return "A300B";
	}
	
	public Marque getNomMarque() {
		return Marque.AUDI;
	}

	@Override
	public String toString() {
		return getNomMarque() + ": A300B " +  moteur + ", options=" + options +" avec un prix total "+ getPrix() ;
	}
}
