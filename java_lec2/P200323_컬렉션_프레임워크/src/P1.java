//제너릭
              //어떤 이름 아무렇게나?
			  //정의를 할 땐 이렇게 가능하지만 동작할 땐 문제 발생
			  //객체 생성할 때(메모리 생성할 때) 형을 지정하겠다는 뜻
			  //클래스 선언할 때 데이터 타입을 모르는 경우(보통 프레임워크 만드는 경우)
class SomeData<T,E>{

	T score;
	E name;
	int age;

}

public class P1 {

	public static void main(String[] args) {
		
		         //기본타입은 못들어가게 되어있음, <클래스타입>만!!!!!!
		SomeData<Integer,String> data=
				new SomeData<Integer,String>();
	
		SomeData<System,Math> data1=
				new SomeData<System,Math>();
	
	
	}

}
