package methodex;

public class MethodEx8 {

	
	
	public static void view1() {
		System.out.println("static method");
	}
	
	public void view2() {
		System.out.println("non-static method");
	}
	
	public static void main(String[] args) {
		//클래스 메서드(class method): 객체 없이 호출 가능
		view1();  //자기 자신의 메서드에 접근할 때는 클래스 이름 생략 가능
		
		//클래스의 오브젝트는 인스턴스??? 클래스의 인스턴스가 오브젝트
		
		MethodEx8 ob=new MethodEx8();  //객체생성
		ob.view2();    // 인스턴스 메서드(instance method)
		               // 반드시 객체를 생성하고 메서드를 호출해야함
		
		
	}

}
