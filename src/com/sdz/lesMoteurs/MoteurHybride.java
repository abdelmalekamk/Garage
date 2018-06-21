package com.sdz.lesMoteurs;

public class MoteurHybride extends Moteur {

	public MoteurHybride(String cylindre, double prix) {
		super(cylindre, prix);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moteur : " + getType() + " Cylindre = " + cylindre + ", prix =" + getPrix() ;
	}

	public double getPrix() {
		return 900;
	}
	
	public TypeMoteur getType() {
		return TypeMoteur.HYBRIDE;
	}
}
