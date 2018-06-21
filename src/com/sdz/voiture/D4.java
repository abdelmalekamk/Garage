package com.sdz.voiture;

import com.sdz.service.Marque;
import com.sdz.service.Vehicule;

public class D4 extends Vehicule{

	public D4() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNom() {
		return "D4";
	}
	
	public Marque getNomMarque() {
		return Marque.VOLVO;
	}

	@Override
	public String toString() {
		return getNomMarque() + ": D4 " +  moteur + ", options=" + options +" avec un prix total "+ getPrix() ;
	}

}
