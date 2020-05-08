package com.elite.test06;

public class PlaneTest {

	public static void main(String[] args) {
    
	
	
//		Plane ap=new Airplane("L747", 1000);
//		Plane cp=new Cargoplane("C40", 1000);
		
		
		Plane ap=new Airplane();
		Plane cp=new Cargoplane();
		
		ap=new Airplane("L747", 1000);
		cp=new Cargoplane("C40", 1000);
		
		
		
		System.out.println("Plane    fuelSize");
		System.out.println("------------------");
		System.out.println(ap.getPlaneName()+"      "+ap.getFuelSize());
		System.out.println(cp.getPlaneName()+"       "+cp.getFuelSize());

		System.out.println();
		System.out.println("<100운항>");
		System.out.println("Plane    fuelSize");
		System.out.println("------------------");
		ap.flight(100);
		cp.flight(100);
		

		System.out.println();
		System.out.println("<200주유>");
		System.out.println("Plane    fuelSize");
		System.out.println("------------------");
		ap.refuel(200);
		cp.refuel(200);
	
	
	}

}
