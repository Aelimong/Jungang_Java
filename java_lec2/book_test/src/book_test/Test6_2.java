package book_test;
/*키보드로 시험 점수를 입력 받은 후, 그 합계를 출력하는 코드를 작성하십시오.
 *0을 입력받으면 결과를 출력하도록 합니다
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("시험 점수를 입력하십시오.(0으로 종료)");
		
	
		int sum=0;
		while(true) {
			
			int n=Integer.parseInt(br.readLine());
			
			if(n==0) {
				break;
			}
			sum+=n;
		} 
		System.out.println("시험점수의 합계는 "+sum+"점 입니다");
	
		
		
		
		
		
	}

}
