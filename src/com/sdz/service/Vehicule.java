package com.sdz.service;

import java.util.LinkedList;
import java.util.List;

import com.sdz.lesMoteurs.Moteur;

public abstract class Vehicule {
	
	protected double prix ; 
	protected String nom = new String ();
	protected List<Option> options = new LinkedList<Option>();
	protected Marque nomMarque ;
	protected Moteur moteur;
	
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	public double getPrix() {
		for(Option op : options ) {
			prix +=  op.getPrix();
		}
		return prix + moteur.getPrix();
	}
	public List<Option> getOptions() {
		return options;
	}
	public Marque getNomMarque() {
		return nomMarque;
	}
	
	public String getNom() {
		return nom;
	}
	@Override
	public String toString() {
		return "Vehicule prix=" + prix + ", nom=" + nom + ", options=" + options + ", nomMarque=" + nomMarque ;
	}
	
	public void addOption (Option op) {
		options.add(op);
	}
}
