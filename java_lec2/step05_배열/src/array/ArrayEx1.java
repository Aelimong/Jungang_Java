package array;
//1차원 배열
//String name="홍길동"
//배열 : 동일한 자료형의 연속된 기억공간


public class ArrayEx1 {

	public static void main(String[] args) {

		int[] num=new int[5];  //5개의 기억공간을 가지는 정수형 배열선언 , new연산자: 객체 생성 == 참조자료형이다 / 원본 데이터에 액세스할 수 있는 자료
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		for(int i=num.length-1; i>=0; i--) {
			System.out.println(num[i]);
		}
		
		
		for(int n : num) {
			//기억공간인 n을 변수 선언해줌
			System.out.print(n+" ");
	
		}
		
	}

}
