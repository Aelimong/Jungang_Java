package com.ja.t1;



class A{
	public int v1;
	public void method1() {
		System.out.println("안녕하세요");
	}
	public void method3() {
		System.out.println("A의 메소드...");
	}
}


class B extends A{
	public int v2;
	public void method2() {
		System.out.println("반갑습니다");
	}
	
	@Override
	public void method3() {
		System.out.println("B의 메소드...");
	}
}


public class P1 {

	public static void main(String[] args) {
		//상속 - 다형성 - 오버라이딩 => 인터페이스
		B ref = new B();
		A ref1 = new B();
		//객체는 만들어지지만 객체 안에 들어가는 형이 변하는 것임
		//A클래스형으로 자동 형변환이 일어남, A클래스의 변수에만 접근가능
		ref1.v1=10;
		ref1.method3();
		
	}

}
