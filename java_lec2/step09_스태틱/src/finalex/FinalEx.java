package finalex;
/*
 * 파이널 지정자
 */

class A{
	final int n=100; 
	final public void view() {
//		n=200; //n변수가 파이널 변수라서 값 변경 불가/ 상수라고 생각하면 됨
      System.out.println("A class");
	}
	
}

class B extends A{
//	@Override
//	public void view() { }  //final 메서드는 오버라이드 불가능!!!!

	
	
}

public class FinalEx {

	public static void main(String[] args) {

		
		
		
		
	}

}
