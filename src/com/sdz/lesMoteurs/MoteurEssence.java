package com.sdz.lesMoteurs;

public class MoteurEssence extends Moteur  {

	public MoteurEssence(String cylindre, double prix) {
		super(cylindre, prix);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moteur : " + getType() + " Cylindre = " + cylindre + ", prix =" + getPrix() ;
	}

	public double getPrix() {
		return 600;
	}
	
	public TypeMoteur getType() {
		return TypeMoteur.ESSENCE;
	}
}
