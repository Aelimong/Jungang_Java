package com.elite.test06;

public class Cargoplane extends Plane{

	public Cargoplane() {
		// TODO Auto-generated constructor stub
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}
	
	@Override  //¿îÇ×
	public void flight(int distance) {
		setFuelSize(getFuelSize()-((distance/10)*50));
		System.out.println(getPlaneName()+"         "+(getFuelSize()));
		
	}


}
