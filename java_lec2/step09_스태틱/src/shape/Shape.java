
package shape;
/*
 *  -x:int
 *  -y:int
 *  +Shape()
 *  +Shape(x:int, y;int)
 *  +setter&getter
 *  +getSize():double 
 * 
 * 
 */
public class Shape {

	private int x;
	private int y;
	
	public Shape() {
		
	}

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double getSize() {
		return 0.0;  // 어차피 자식 클래스에서 오버라이딩 할거라서 //자료형의 초기값으로 지정
	}
	
}
