package test;

/*
 * 1���� 20������ ���� �߿��� 
 * 2�� ����� �ƴϰ� 
 * 3�� ����� �ƴ� ���� ������ ���Ͻÿ�
 */

public class Test01 {

	public static void main(String[] args) {
           
		int sum=0;
		for(int i=0; i<20; i++) {
			if(i%2!=0 && i%3!=0) {
				sum+=i;
			}
		}
		System.out.println("sum = "+sum);
//
//		for(int i=1; i<=100; i++) {
//			if(i%7!=0) 
//			  continue;
//			System.out.println(i);
//		}
		
		//sum = 73
		
	}

}
