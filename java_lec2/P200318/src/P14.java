class Test{
	 int v1; 
	 static int v2; //메모리 생성소멸이 다름 
	                //스택X힙X 메소드영역에 메모리 생성
	                //프로그램 시작할 때 ★딱 한 번★ 생성됨
	 				//최고 단점 : 프로그램 끝날 때까지 소멸 불가능(메모리 관리 불가)
}

class A{
	void aaaa() {
		Test.v2=40; //최고장점 : 아무데서나 쓸 수 있다(글로벌~~~~~)
		
	}
}

//인스턴스 생성한다는 게 뭐지?


public class P14 {

	public static void main(String[] args) {
		//Test t1= new Test(); //static이 안 붙은 애만 생성됨
		//Test t2= new Test(); 
	   
	
		Test.v2=10; //static에 접근할 때 '클래스명.변수명'으로 호출함
		            //클래스 객체 안 만들어도 생성되어 있어서 호출 가능함
		
		
		
	}

}
