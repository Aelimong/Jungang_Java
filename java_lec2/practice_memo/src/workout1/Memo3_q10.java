package workout1;

/*
 [문제10] 다음과 같은 메서드를 작성하고 결과를 완성하시오
(1)메인메서드에서 아래 메서드를 호출하고 호출메서드에서 
    계산된 결과를  리턴할것 
     sum(3,5)    /     sub(7,2)   /     mul(4,5)   /     div(7,3)
(2)메서드에서 받은 결과값은 메인메서드에서 출력하시오

[실행 예]
System.out.println("더하기 : " + sum(3,5));             

[출력화면]
더하기 : 8
빼  기 : 5
곱하기 : 20
나누기 : 2.33
 */


public class Memo3_q10 {
           //static 기억공간(객체)를 만들지 않았을때는 꼭 써줘야한다
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sub(int c, int d) {
		return c-d;
	}
	
	public static int mul(int e, int f) {
		return e*f;
	}
	
	public static double div(int h, int g) {
		return (h/(double)g);
	}
	
	public static void main(String[] args) {

	
	sum(3, 5);
	sub(7, 2);
	mul(4, 5);
	div(7, 3);
	
	System.out.println("더하기 : "+sum(3, 5));
	System.out.println("빼기 : "+sub(7, 2));
	System.out.println("곱하기 : "+mul(4, 5));
	System.out.printf("나누기 : %.2f\n", div(7, 3));
	
	}

}
