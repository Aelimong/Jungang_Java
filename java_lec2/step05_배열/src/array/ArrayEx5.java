package array;
/*ũ�Ⱑ 5���� ������ �迭�� ��� �迭�� �����͸�
 * �Է¹޾Ƽ� ����ϰ� �ִ�, �ּҰ��� ���ϼ���.
 * 
 * 
 * ---���
 * ar[0]�� ���� �Է� : 25
 * ar[1]�� ���� �Է� : -34
 * ar[2]�� ���� �Է� : 10
 * ar[3]�� ���� �Է� : 16
 * ar[4]�� ���� �Է� : 8 
 * 
 * 25 -34 10 16 8
 * 
 * �ִ밪 : 25
 * �ּҰ� : -34
 * 
 * �Է�  /�ִ��ּ� /���
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//�Է�
		int [] num=new int[5];
		
		for(int i=0; i<num.length; i++) {
			System.out.print("num["+i+"]�� ���� �Է� : ");
			num[i]=Integer.parseInt(br.readLine());
			
		}
		
		//�ִ� �ּ� ���		
		int max=num[0];
		int min=num[0];
		
		for(int i=1; i<num.length; i++) {
			if(num[i] > max) max=num[i];
			if(num[i] < min) min=num[i];
		}
		
		//���
		for(int n : num)
			System.out.print(n+" ");

		System.out.println("\n"+"�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
		
		
	}

}
