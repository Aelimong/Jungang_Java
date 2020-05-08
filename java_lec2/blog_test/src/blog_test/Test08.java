package blog_test;

//2~100사이의 소수를 구해보자
public class Test08 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			
			for (int j = 2; j <=i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			

			if (count == 1) {
				System.out.println(i);
			}

			count=0; //초기화 시켜주는 게 중요!!!!
		}

	}

}
