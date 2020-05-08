package access1;
/*
 * 
 접근지정자

프라이빗 외부 패키지에서 사용불가
	
외부에서 접근 가능하게 하려면 퍼블릭
변수는 프라이빗
함수는 퍼블릭
	
 * 
 */
import access2.AccessEx3;
import access2.AccessEx4;

public class AccessEx1 extends AccessEx4 {
	
	private int x=10;
	private int y=20;

	public static void main(String[] args) {

		AccessEx1 a1=new AccessEx1();
		System.out.println(a1.x+"\t"+a1.y);  
		System.out.println(a1.a+"\t"+a1.b);  
		
		AccessEx2 a2=new AccessEx2();
		System.out.println(a2.x+"\t"+a2.y+"\t"+a2.a);  
		
//		AccessEx3 a3=new AccessEx3();
//		System.out.println(a3.x+"\t"+a3.x1);  다른 패키지 사용하려면 import해줘야함(컨트롤+스페이스바)
//		                                      x1이 디폴트 지정자라 다른 패키지에서 사용불가
		
		AccessEx3 a3=new AccessEx3();
		System.out.println(a3.x+"\t"+a3.y);
		
//		AccessEx4 a4=new AccessEx4();
//		System.out.println(a4.x);    //protected x는 패키지를 벗어나면 쓸 수 없음 / 같은 패키지 안에선 자유롭게 사용가능 
		
	}
	
	
	//

}
