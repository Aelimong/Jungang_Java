package practice_memo2;

/*
[문제9] for문을 이용하여 제곱값을 구하시오
x의 값을 입력하시오 : 3
y의 값을 입력하시오 : 3
3의 3승은 27
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test9 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      
	      System.out.print("x의 값을 입력하시오: ");
	      int x=Integer.parseInt(br.readLine());
	      
	      System.out.print("y의 값을 입력하시오: ");
	      int y=Integer.parseInt(br.readLine());
	      
	      long result=x;
	      for(int i=x; i<=x; i++) {
	         for(int j=1; j<y; j++) {
	            result*=x;
	         }
	      }
	      System.out.println(result);
		
		
	}

}
