package shape;

/* +Rectangle()
 * +Rectangle(x:int, y:int)
 * +getSize():double
 * 
 */


public class Rectangle extends Shape {

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(int x, int y) {
		super(x,y);
		
	}
	
	public double getSize() {
		return getX()*getY();
	}
	
}
