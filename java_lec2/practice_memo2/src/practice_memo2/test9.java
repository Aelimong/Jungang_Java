package practice_memo2;

/*
[����9] for���� �̿��Ͽ� �������� ���Ͻÿ�
x�� ���� �Է��Ͻÿ� : 3
y�� ���� �Է��Ͻÿ� : 3
3�� 3���� 27
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test9 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      
	      System.out.print("x�� ���� �Է��Ͻÿ�: ");
	      int x=Integer.parseInt(br.readLine());
	      
	      System.out.print("y�� ���� �Է��Ͻÿ�: ");
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
