package test27;

public class CircleRound extends Circle {

	public CircleRound() {
		// TODO Auto-generated constructor stub
	}
	
	public CircleRound(int r) {
	   super(r);
	}
	
	@Override
    public void compute() {	
	 size=r*2*PI;
	}
	
	@Override
	public void output() {
		System.out.println("원의 둘레 : "+size);
	}
	
}
