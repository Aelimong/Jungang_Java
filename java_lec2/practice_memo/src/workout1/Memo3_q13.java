package workout1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����13] �Ʒ��� ���� 12���� ������ �迭�� ����� ����Ų�� 
���ϴ� month�� �Է¹޾� �� ���� ������ ����Ͻÿ�

[����]
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

[�Է�ȭ��/���ȭ��]

���ϴ� month�� �Է��Ͻÿ� : 3
3���� 31���Դϴ�.
*/


public class Memo3_q13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[] month={31,28,31,30,31,30,31,31,30,31,30,31};
		int mon;
		
		System.out.print("���ϴ� month�� �Է��Ͻÿ� : ");
      	mon=Integer.parseInt(br.readLine());
     
        System.out.println(mon+"���� "+month[0]+"���Դϴ�");

		
	}

}
