package com.car;

public class L5 extends Car implements Temp {

	public L5() {
		// TODO Auto-generated constructor stub
	}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void go(int distance) {	
		setDistance(getDistance()+distance);
		System.out.println(getName() + "           " +getEngine() + "         " +getOilTank() + "       "
				+(getOilSize()-(distance/8))+"       " +getDistance() + "       " +getTempGage());
		setOilSize(getOilSize()-(distance/8));
		
	}
	
	@Override
	public void setOil(int oilSize) {
		System.out.println(getName() + "           " +getEngine() + "         " +getOilTank() + "       "
				+(getOilSize()+oilSize)+ "       " +getDistance() + "       " +getTempGage());
	
		setOilSize(getOilSize()+oilSize);	
	};
	
	
	@Override
	public int getTempGage() {
		return (getDistance()/5);
	};
	
	
	
}
