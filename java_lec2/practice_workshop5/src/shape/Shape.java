package shape;

abstract class Shape {
private int width;
private int height;
private String color;

public Shape() {
	// TODO Auto-generated constructor stub
}

public Shape(int width, int height, String color) {
	super();
	this.width = width;
	this.height = height;
	this.color = color;
}

public double getArea() {
	return width*height;
}

public int getWidth() {
	return width;
}

public int getHeight() {
	return height;
}

public String getColor() {
	return color;
}

public void setWidth(int width) {
	this.width = width;
}

public void setHeight(int height) {
	this.height = height;
}

public void setColor(String color) {
	this.color = color;
}


	
	
	
}
