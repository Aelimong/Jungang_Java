package blog_test;
/*
20.
반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보자.
1부터 시작하며 99까지만 한다. 
실행 결과 예) 
3 박수한번
6 박수 한번
9 박수 한번 
.
33 박수 두번
.
98 박수 한번
99 박수 두번
 */
public class Test20 {

	public static void main(String[] args) {
		

		  for (int i = 3; i < 100; i++) {
	            int unit = i % 10;
	            int ten = i / 10;
	            if (i < 10) {
	                if (i % 3 == 0)
	                    System.out.println(i + " 박수 한번");
	            } else {
	                if ((ten % 3 == 0) && (i % 10 == 0))         // 30, 60, 90
	                    System.out.println(i + " 박수 한번");
	                else if ((unit % 3 == 0) && (ten % 3 == 0))  // 일의자리, 십의자리 둘다 3의 배수
	                    System.out.println(i + " 박수 두번");
	                else if ((unit % 3 == 0) || (ten % 3 == 0))   // 3의 배수가 한 개?????
	                if (i % 10 != 0)        // 10의 자리 거르기????????????
	                        System.out.println(i + " 박수 한번");
	            }

	        }
	
		  
		
		
   /*
		int n1, n2=0;
		for(int i=1; i<100; i++) {
			n1=i/10;
			n2=i%10;
			
			if(n1%3==0 || n2%3==0) {
		    System.out.println(i+"박수 한번");
		    } else if(n1%3==0 && n2%3==0) {
		    } System.out.println(i+"박수 두번");
		    
		}
		
	*/
	}
		
}
