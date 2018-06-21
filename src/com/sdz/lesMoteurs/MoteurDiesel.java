package com.sdz.lesMoteurs;

public class MoteurDiesel extends Moteur {
	
	
	public MoteurDiesel(String cylindre, double prix) {
		super(cylindre, prix);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moteur : " + getType() + " Cylindre = " + cylindre + ", prix =" + getPrix() ;
	}

	public double getPrix() {
		return 550;
	}
	
	public TypeMoteur getType() {
		return TypeMoteur.DIESEL;
	}
}
