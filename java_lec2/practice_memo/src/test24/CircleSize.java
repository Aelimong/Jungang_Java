package test24;
/*
 * 
+CircleSize()
+CircleSize(r:int)
+getCalc():double   ==> 원의 넓이를 구한다(반지름*반지름*3.14)
+toString():String    ==> 원의 넓이는 78.5입니다 출력

 */
public class CircleSize extends Circle {

	public CircleSize() {
		// TODO Auto-generated constructor stub
	}

	public CircleSize(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	
	public double getCalc() {
		return getR()*getR()*3.14;
	}

	@Override
	public String toString() {
		return super.toString()+"\n원의 넓이는 "+getCalc()+"입니다"+"\n";
	}
	
	
	
}
