package shape;

public class Rectangle extends Shape implements Resize{

	public Rectangle() {
	// TODO Auto-generated constructor stub
}

	public Rectangle(int width, int height, String color) {
		super(width, height, color);
		// TODO Auto-generated constructor stub
	}
	

@Override
public double getArea() {
	return super.getWidth()*super.getHeight();
}

@Override
public void setResize(int size) {
	System.out.println(super.getWidth()+size);
}
	
	
}
