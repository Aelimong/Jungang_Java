package shape;

public class Triangle extends Shape implements Resize{

	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(int width, int height, String color) {
		super(width, height, color);
		// TODO Auto-generated constructor stub
	}

   @Override
   public double getArea() {
		return (double)(getWidth()*getHeight())/2;
	}


	@Override
	public void setResize(int size) {
	}
	
	
	
	
	
	
}
