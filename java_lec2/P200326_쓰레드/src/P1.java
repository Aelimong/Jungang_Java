class Test1{
	public void method1() {
		System.out.println("메소드 코드들....");
		System.out.println("메소드 코드들....");
		System.out.println("메소드 코드들....");
		System.out.println("메소드 코드들....");
	}
}
public class P1 {

	public static void main(String[] args) {   
		//메인쓰레드 소멸 되어도, 모든 쓰레드가 종료되야지 종료됨.

		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println(c);
		
		new Test1().method1();
		
		
		System.out.println("안녕하세요");
	}

}
