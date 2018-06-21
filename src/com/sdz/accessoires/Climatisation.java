package com.sdz.accessoires;

import com.sdz.service.Option;

public class Climatisation implements Option{
	
	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 225;
	}

	@Override
	public String toString() {
		return "Climatisation (" + getPrix()+" )";
	}

}
