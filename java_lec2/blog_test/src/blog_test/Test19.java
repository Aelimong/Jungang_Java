package blog_test;
/*19.
별찍기 문제
다음과 같이 출력해보자
*
**
***
****
*****
​*/

public class Test19 {

	public static void main(String[] args) {
/*
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		*/
		
		int i=0;
		int j=0;
		while(i<5) {
			j=0;
		  while (j<=i) {
			System.out.print("*");
			  j++;
		  } 
		  System.out.println();
			i++;
			
		}
		
		
		
		
		
	}

}
