package com.sdz.lesMoteurs;

public abstract class Moteur {
	protected String cylindre = new String();
	protected double prix ;
	protected TypeMoteur type;
	
	public Moteur(String cylindre, double prix) {
		super();
		this.cylindre = cylindre;
		this.prix = prix;
	}

	public double getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return "Moteur : " + type+" cylindre = "+ cylindre + ", prix=" + prix ;
	}
	
	
}
