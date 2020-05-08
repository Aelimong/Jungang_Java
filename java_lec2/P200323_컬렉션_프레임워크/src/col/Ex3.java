package col;

import java.util.*;

class Test{             //표준을 인터페이스로 맞출 수 있음
	public void method1(List<String> list) {
		method2(list);
	}

    public void method2(List<String> list) {
		
	}

}

public class Ex3 {

	public static void main(String[] args) {
		//보편적인 선언방법
		//계열별로 인터페이스가 있다, 표준이 있다
		
		                     //변수에만 String 선언해주면 객체생성부분<>에는 자동으로 
							 // 맞춰짐
		List<String> list = new ArrayList<>();
		 //List<String> list = new ArrayList<String>();
		 //List<String> list1 = new LinkedList<String>();
		 //--->받는 쪽을 인터페이스로 선언하면 유지보수가 쉬워진다!!!!!
		 //소스간의 결합도를 낮춰져 있기 때문에 모듈교체가 쉽다

		 //List는 표준이 정의되어있다. 
		//ArrayList는 List를 상속 받음
		//LinkedList도 인터페이스 List가 구현되어있는 상태
		
		new Test().method1(list);
		
	}

}
