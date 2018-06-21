package com.sdz.accessoires;

import com.sdz.service.Option;

public class GPS implements Option{

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public String toString() {
		return "GPS (" + getPrix()+" )";
	}

}
