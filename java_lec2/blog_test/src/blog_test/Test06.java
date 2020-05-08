package blog_test;
//구구단을 출력을 하되 7단과 6단을 제외하고 출력하자.

public class Test06 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			if (i != 6 && i != 7) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
				   System.out.println();
			}
		}

		
		
		
		
		
	}

}
