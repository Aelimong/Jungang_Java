package test27;

public class CircleArea extends Circle {

	public CircleArea() {
		// TODO Auto-generated constructor stub
	}
	 public CircleArea(int r) {
		super(r);
	}
	
	 @Override
	 public void compute() {
		 size=r*r*PI;
	}
		
	 @Override	
	 public void output() {
		System.out.println("���� ���� : "+size);
	}
	
	
}
