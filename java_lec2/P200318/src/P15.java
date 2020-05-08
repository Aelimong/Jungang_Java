//메소드 스태틱

class Calc{ //순수하게 기능만 관련된 클래스
	        //속성이 없는데 굳이 new생성 해줘야하나
	
	static int plus(int a, int b){
		return a+b;
	} //생성을 안 해도 쓸 수 있음

	static int minus(int a, int b) {
		return a-b;
	}
	
}
public class P15 {

	public static void main(String[] args) {

		int v1=10;
		int v2=20;
		
		int result = Calc.plus(v1, v2); //new 객체 생성 안 해도 사용 가능~!
		System.out.println(result);
		
		// Math.log(100);//매쓰클래스들을 모두 스태틱
		                 // 클래스 안에 속성을 가지고 있을 필요가 없기 때문에
		

		
	}

}
