package book_test;
//Ű����� ������ �޾Ƽ� �� ���� �Ҽ����� �Ǵ��ϴ� �ڵ带 �ۼ��϶�

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6_5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("2�̻��� ������ �Է��Ͻʽÿ�");
		int n=Integer.parseInt(br.readLine());
		
		int cnt=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println(n+"�� �Ҽ��Դϴ�");
		}else {
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�");
		}
		
		

		
	}

}
