package test24;
/*
+CircleRound()
+CircleRound(r:int)
+getCalc():double   ==> ���� �ѷ��� ���Ѵ�(������*2*3.14)
+toString():String    ==> ���� �ѷ��� 62.8�Դϴ�   ���
 */
public class CircleRound extends Circle {

	public CircleRound() {
	
	}

	public CircleRound(int r) {
		super(r);
		
	}
	
	public double getCalc() {
		return getR()*2*3.14;
	}

	@Override
	public String toString() {
		return super.toString()+"\n���� �ѷ��� "+String.format("%.1f",getCalc())+"�Դϴ�"+"\n";
	}
	
	
	
	
}
