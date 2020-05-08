package com.elite.test06;

public class Airplane extends Plane {
	
	public Airplane() {
		// TODO Auto-generated constructor stub
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}
	
	@Override //¿îÇ×
	public void flight(int distance) {
		setFuelSize(getFuelSize()-((distance/10)*30));
		System.out.println(getPlaneName()+"        "+getFuelSize());
	
	}

}
