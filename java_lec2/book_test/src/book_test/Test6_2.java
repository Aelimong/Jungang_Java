package book_test;
/*Ű����� ���� ������ �Է� ���� ��, �� �հ踦 ����ϴ� �ڵ带 �ۼ��Ͻʽÿ�.
 *0�� �Է¹����� ����� ����ϵ��� �մϴ�
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("���� ������ �Է��Ͻʽÿ�.(0���� ����)");
		
	
		int sum=0;
		while(true) {
			
			int n=Integer.parseInt(br.readLine());
			
			if(n==0) {
				break;
			}
			sum+=n;
		} 
		System.out.println("���������� �հ�� "+sum+"�� �Դϴ�");
	
		
		
		
		
		
	}

}
