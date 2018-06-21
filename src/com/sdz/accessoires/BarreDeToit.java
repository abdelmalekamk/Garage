package com.sdz.accessoires;

import com.sdz.service.Option;

public class BarreDeToit implements Option{

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	public String toString() {
		return "BarreDeToit ( "+ getPrix() +" )";
	}

}
