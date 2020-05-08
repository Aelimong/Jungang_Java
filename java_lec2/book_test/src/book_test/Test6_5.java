package book_test;
//키보드로 정수를 받아서 그 수가 소수인지 판단하는 코드를 작성하라

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6_5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("2이상의 정수를 입력하십시오");
		int n=Integer.parseInt(br.readLine());
		
		int cnt=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println(n+"은 소수입니다");
		}else {
			System.out.println(n+"은 소수가 아닙니다");
		}
		
		

		
	}

}
