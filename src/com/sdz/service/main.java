package com.sdz.service;

import javax.swing.JFrame;

import com.sdz.accessoires.BarreDeToit;
import com.sdz.accessoires.Climatisation;
import com.sdz.accessoires.GPS;
import com.sdz.accessoires.SiegeChauffant;
import com.sdz.accessoires.VitreElectrique;
import com.sdz.lesMoteurs.MoteurDiesel;
import com.sdz.lesMoteurs.MoteurElectrique;
import com.sdz.lesMoteurs.MoteurEssence;
import com.sdz.lesMoteurs.MoteurHybride;
import com.sdz.voiture.A300B;
import com.sdz.voiture.D4;
import com.sdz.voiture.Lagouna;

public class main {

	public static void main(String[] args) {
		
		JFrame fenetre = new JFrame();
		fenetre.setVisible(true);
		// TODO Auto-generated method stub
		Garage garage = new Garage();   
	   	 System.out.println(garage);
	   	 
	   	 Vehicule lag1 = new Lagouna();
	   	 lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
	   	 lag1.addOption(new GPS());
	   	 lag1.addOption(new SiegeChauffant());
	   	 lag1.addOption(new VitreElectrique());
	   	 garage.addVoiture(lag1);
	   		 
	   	 Vehicule A300B_2 = new A300B();
	   	 A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
	   	 A300B_2.addOption(new Climatisation());
	   	 A300B_2.addOption(new BarreDeToit());
	   	 A300B_2.addOption(new SiegeChauffant());
	   	 garage.addVoiture(A300B_2);
	   	 
	   	 Vehicule d4_1 = new D4();
	   	 d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
	   	 d4_1.addOption(new BarreDeToit());
	   	 d4_1.addOption(new Climatisation());
	   	 d4_1.addOption(new GPS());
	   	 garage.addVoiture(d4_1);   	 
	   	 
	   	 Vehicule lag2 = new Lagouna();
	   	 lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
	   	 garage.addVoiture(lag2);
	   	 
	   	 Vehicule A300B_1 = new A300B();
	   	 A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
	   	 A300B_1.addOption(new VitreElectrique());
	   	 A300B_1.addOption(new BarreDeToit());
	   	 garage.addVoiture(A300B_1);
	   	 
	   	 Vehicule d4_2 = new D4();
	   	 d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
	   	 d4_2.addOption(new SiegeChauffant());
	   	 d4_2.addOption(new BarreDeToit());
	   	 d4_2.addOption(new Climatisation());
	   	 d4_2.addOption(new GPS());
	   	 d4_2.addOption(new VitreElectrique());
	   	 garage.addVoiture(d4_2);   
	   	 
	   	 garage.listeVoiture();
	}

}
