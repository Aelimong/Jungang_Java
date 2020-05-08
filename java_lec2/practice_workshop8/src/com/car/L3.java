package com.car;

public class L3 extends Car implements Temp {

	public L3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void go(int distance) {	
		setDistance(getDistance()+distance);
		System.out.println(getName() + "           " +getEngine() + "         " +getOilTank() + "       "
				+(getOilSize()-(distance/10))+"       " +getDistance() + "       " +getTempGage());
		setOilSize(getOilSize()-(distance/10));
	}
	
	@Override
	public void setOil(int oilSize) {
		System.out.println(getName() + "           " +getEngine() + "         " +getOilTank() + "       "
				+(getOilSize()+oilSize)+ "       " +getDistance() + "       " +getTempGage());
	
		setOilSize(getOilSize()+oilSize);	
	};
	
	
	@Override
	public int getTempGage() {
		return (super.getDistance()/10);
	};
	
	
}
