package interfaceex;

//------------------------------------------------------추상(미완성)클래스
interface Shape{
	/*final*/ int r=10;  //변수에 지정만 해주면 된다
	/*abstract*/ public void draw();
	/*abstract*/abstract public void erase();
//결과적으로 큰 의미를 갖지 않는다
}

class Circle implements Shape{  //임플리먼트 -->구현
	@Override
	public void draw() {          //강제 재정의: 무조건 오버라이드 해야함!!! 프로젝트 시 팀원들이 같은 함수 쓰도록
		System.out.println("반지름이 "+r+"인 원을 그린다");
	}
	
	@Override
	public void erase() {
		System.out.println("원을 지운다");
		
	}
}


public class InterfaceEx1 {

	public static void main(String[] args) {
		Circle cir=new Circle();
		cir.draw();
		cir.erase();
		
		
	}

}



////------------------------------------------------------추상(미완성)클래스
//abstract class Shape{
//	final int r=10;
//	abstract public void draw();
//	// 정의를 나타내는 {} 지워야함 저게 있으면 완성된 형태이기 때문에
//	abstract public void erase();
//
//}
//
//class Circle extends Shape{
//	@Override
//	public void draw() {          //강제 재정의: 무조건 오버라이드 해야함!!! 프로젝트 시 팀원들이 같은 함수 쓰도록
//		System.out.println("반지름이 "+r+"인 원을 그린다");
//	}
//	
//	@Override
//	public void erase() {
//		System.out.println("원을 지운다");
//		
//	}
//}
//
//
//public class InterfaceEx1 {
//
//	public static void main(String[] args) {
//		Circle cir=new Circle();
//		cir.draw();
//		cir.erase();
//		
//		
//	}
//
//}




//----------------------------------------------일반클래스
//class Shape{
//	final int r=10;
//	public void draw() {}
//	public void erase() {}
//
//}
//
//class Circle extends Shape{
//	@Override
//	public void draw() {
//		System.out.println("반지름이 "+r+"인 원을 그린다");
//	}
//	
//	@Override
//	public void erase() {
//		System.out.println("원을 지운다");
//		
//	}
//}
//
//
//public class InterfaceEx1 {
//
//	public static void main(String[] args) {
//		Circle cir=new Circle();
//		cir.draw();
//		cir.erase();
//		
//		
//	}
//
//}
