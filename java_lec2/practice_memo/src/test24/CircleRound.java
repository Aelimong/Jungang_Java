package test24;
/*
+CircleRound()
+CircleRound(r:int)
+getCalc():double   ==> 원의 둘레를 구한다(반지름*2*3.14)
+toString():String    ==> 원의 둘레는 62.8입니다   출력
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
		return super.toString()+"\n원의 둘레는 "+String.format("%.1f",getCalc())+"입니다"+"\n";
	}
	
	
	
	
}
