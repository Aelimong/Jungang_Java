package workshop1;
/*
 * ---출력
 * 선언 변수 5일 때 결과:
 * 숫자 5는 홀수입니다
 */
public class Test07 {

	public static void main(String[] args) {

		int i=5;
		String result= i%2==1?"홀수":"짝수";
		System.out.println("선언변수 "+i+"일때 결과: \n"+"숫자 "+i+"는 "+result+"입니다");
		
	}

}
