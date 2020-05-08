package shape;
/* +Triangle()
 * +Triangle(x:int, y:int)
 * +getSize():double
 * 
 */


public class Triangle extends Shape {


	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(int x, int y) {
		super(x,y);
		
	}
   @Override //부모클래스와 같은 함수 사용하는 것 
	public double getSize() {
		return (getX()*getY()/2.0);
	}
	
	
	
}
