package com.elite.test02;

public class Human {

	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String printInformation() {
		return getName()+" "+getAge()+" "+getHeight()+" "+getWeight();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
	
	
}
