package com.ja.t2;

interface Xxx{ //오버라이딩, 상속용, 표준을 선언한다@!!
	
	public abstract void method(); 
	//인터페이스에는 무조건  public!!&'abstract 메소드만' 생성가능
	//그래서 앱스트랙트 없애도 앱스트랙트로 인지함

}

class AA implements Xxx{
	
	public void method() {
		System.out.println("안녕하세요");
	}; 
	
}

public class P2 {

	public static void main(String[] args) {
		Xxx ref=new AA();
		ref.method();
		
	}

}
