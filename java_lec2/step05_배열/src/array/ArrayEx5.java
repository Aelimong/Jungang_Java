package array;
/*크기가 5개인 정수형 배열을 잡고 배열에 데이터를
 * 입력받아서 출력하고 최대, 최소값을 구하세요.
 * 
 * 
 * ---결과
 * ar[0]의 값을 입력 : 25
 * ar[1]의 값을 입력 : -34
 * ar[2]의 값을 입력 : 10
 * ar[3]의 값을 입력 : 16
 * ar[4]의 값을 입력 : 8 
 * 
 * 25 -34 10 16 8
 * 
 * 최대값 : 25
 * 최소값 : -34
 * 
 * 입력  /최대최소 /출력
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//입력
		int [] num=new int[5];
		
		for(int i=0; i<num.length; i++) {
			System.out.print("num["+i+"]의 값을 입력 : ");
			num[i]=Integer.parseInt(br.readLine());
			
		}
		
		//최대 최소 계산		
		int max=num[0];
		int min=num[0];
		
		for(int i=1; i<num.length; i++) {
			if(num[i] > max) max=num[i];
			if(num[i] < min) min=num[i];
		}
		
		//출력
		for(int n : num)
			System.out.print(n+" ");

		System.out.println("\n"+"최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
	}

}
