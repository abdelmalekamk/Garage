package com.sdz.accessoires;

import com.sdz.service.Option;

public class SiegeChauffant implements Option {

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 175;
	}

	@Override
	public String toString() {
		return "Siege Chauffant (" + getPrix()+" )";
	}

}
