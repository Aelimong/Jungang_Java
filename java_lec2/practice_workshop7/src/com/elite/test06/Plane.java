package com.elite.test06;

abstract class Plane {
	private String planeName;
	private int fuelSize;
	
	public Plane() {
		// TODO Auto-generated constructor stub
	}

	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		fuelSize=fuelSize+fuel;
		System.out.println(planeName+"       "+fuelSize);

	}
	
	public abstract void flight(int distance);
	

	public String getPlaneName() {
		return planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	
	
}
