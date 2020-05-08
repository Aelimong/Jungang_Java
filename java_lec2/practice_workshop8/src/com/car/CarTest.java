package com.car;

public class CarTest {

	public static void main(String[] args) {
		Car l3 = new L3();
		Car l5 = new L5();

		
		l3 = new L3("L3", "1500", 50, 25, 0);
		l5 = new L5("L5", "2000", 70, 35, 0);

		
		System.out.println("vehicleName" + "  " + "engineSize" + "  " + "oilTank" + "  " + "oilSize" + "  " + "distance"
				+ " " + "temperature");
		System.out.println("-----------------------------------------------------------------");
		System.out.println(l3.getName() + "           " + l3.getEngine() + "         " + l3.getOilTank() + "       "
				+ l3.getOilSize() + "       " + l3.getDistance() + "       " + (l3.getDistance()/10));
		System.out.println(l5.getName() + "           " + l5.getEngine() + "         " + l5.getOilTank() + "       "
				+ l5.getOilSize() + "       " + l5.getDistance() + "       " + (l3.getDistance()/5));

		System.out.println();
		System.out.println("<25주유>");
		System.out.println("vehicleName" + "  " + "engineSize" + "  " + "oilTank" + "  " + "oilSize" + "  " + "distance"
				+ " " + "temperature");
		System.out.println("-----------------------------------------------------------------");
		l3.setOil(25);
		l5.setOil(25);
		
		System.out.println();
		System.out.println("<80주행>");
		System.out.println("vehicleName" + "  " + "engineSize" + "  " + "oilTank" + "  " + "oilSize" + "  " + "distance"
				+ " " + "temperature");
		System.out.println("-----------------------------------------------------------------");
		
		l3.go(80);
		l5.go(80);
		
	}

}
