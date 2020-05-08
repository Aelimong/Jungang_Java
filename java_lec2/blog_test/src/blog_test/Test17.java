package blog_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 
다음 수를 만들어 나가는 수열이다. 
예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 
그 다음 수는 1과 2를 더해서 3이 되어서 
1, 1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 
1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 
계산하는 프로그램을 완성하시오.
 */
public class Test17 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * System.out.print("반복 횟수를 입력하여 주세요 : "); int
		 * num=Integer.parseInt(br.readLine());
		 * 
		 * int n1=1; int n2=1; int n3;
		 * 
		 * for(int i=1; i<=num; i++) { if(i==1) { System.out.println("1번째의 값 : "+n1); }
		 * else if(i==2) { System.out.println("2번째의 값 : "+n2); } else { n3=n1+n2;
		 * System.out.println(i+"번째의 값 : "+n3); n1=n2; n2=n3;
		 * 
		 * } }
		 * 
		 * 
		 * int last1, last2, result = 0;
		 * 
		 * last1 = 1; last2 = 1;
		 * 
		 * for(int i=1; i < 9; i++) { result = last1 + last2; last1 = last2; last2 =
		 * result; }
		 * 
		 * System.out.println(result);
		 * 
		 * 
		 */

		int n1, n2, result = 0;

		n1 = 1;
		n2 = 1;

		for (int i = 1; i <= 8; i++) {
			result = n2 + n1;
			n1 = n2;
			n2 = result;
		}
		System.out.println(result);

	}

}
