class A1{
	
	static int plus(final int a, final int b) { //final 변수는 수정할 수 없게 만드는 것(안정성 확보)
		return a+b;
	}
	
}


public class P1 {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 20;
		int result=A1.plus(v1, v2);
		System.out.println(result);

	}

}
