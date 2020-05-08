package com.elite.test02;

public class Student extends Human {

	private String number;
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}


	@Override
	public String printInformation() {
		return super.printInformation()+" "+getNumber()+" "+getMajor();
	}

	public String getNumber() {
		return number;
	}

	public String getMajor() {
		return major;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
	
	
}
