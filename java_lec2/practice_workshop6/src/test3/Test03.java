package test3;

public class Test03 {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		int sum = 0;

//		for(int i=0; i<5; i++) {

		while (true) {
			if (n < 0 || n > 5) {
				System.out.println("입력값의 범위가 초과하였습니다");
				break;
			}
			
//			for(int j=0; )
			for (int i = n; i <= 10; i++) {    
				if (i % 3 != 0 && i % 5 != 0) {
					System.out.print(i + " ");
					System.out.print("+");
					sum += i;
					
				}
			}
			System.out.println("\n" + "결과 :" + sum);
			break;
		}

	}

}
