package blog_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
�Ǻ���ġ(Fibonnaci) ����(���)�� ���� �� ���� ���ؼ� 
���� ���� ����� ������ �����̴�. 
���� ��� ���� �� ���� 1�� 1�̶�� �� ���� ���� 2�� �ǰ� 
�� ���� ���� 1�� 2�� ���ؼ� 3�� �Ǿ 
1, 1,2,3,5,8,13,21,... �� ���� ������ ����ȴ�. 
1�� 1���� �����ϴ� �Ǻ���ġ������ 10��° ���� �������� 
����ϴ� ���α׷��� �ϼ��Ͻÿ�.
 */
public class Test17 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * System.out.print("�ݺ� Ƚ���� �Է��Ͽ� �ּ��� : "); int
		 * num=Integer.parseInt(br.readLine());
		 * 
		 * int n1=1; int n2=1; int n3;
		 * 
		 * for(int i=1; i<=num; i++) { if(i==1) { System.out.println("1��°�� �� : "+n1); }
		 * else if(i==2) { System.out.println("2��°�� �� : "+n2); } else { n3=n1+n2;
		 * System.out.println(i+"��°�� �� : "+n3); n1=n2; n2=n3;
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
