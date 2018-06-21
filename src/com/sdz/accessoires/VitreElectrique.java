package com.sdz.accessoires;

import com.sdz.service.Option;

public class VitreElectrique implements Option {
	
	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 250;
	}
	
	@Override
	public String toString() {
		return "Vitre Electrique (" + getPrix()+" )";
	}

}
