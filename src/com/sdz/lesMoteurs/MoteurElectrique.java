package com.sdz.lesMoteurs;

public class MoteurElectrique extends Moteur{

	public MoteurElectrique(String cylindre, double prix) {
		super(cylindre, prix);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moteur : " + getType() + " Cylindre = " + cylindre + ", prix =" + getPrix() ;
	}

	public double getPrix() {
		return 700;
	}
	
	public TypeMoteur getType() {
		return TypeMoteur.ELECTRIQUE;
	}
}
