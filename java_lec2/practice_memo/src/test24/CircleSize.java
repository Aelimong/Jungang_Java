package test24;
/*
 * 
+CircleSize()
+CircleSize(r:int)
+getCalc():double   ==> ���� ���̸� ���Ѵ�(������*������*3.14)
+toString():String    ==> ���� ���̴� 78.5�Դϴ� ���

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
		return super.toString()+"\n���� ���̴� "+getCalc()+"�Դϴ�"+"\n";
	}
	
	
	
}
