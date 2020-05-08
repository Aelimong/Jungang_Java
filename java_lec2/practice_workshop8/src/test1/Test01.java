package test1;
/*
 * 
(A+B)/2 : 60%
(C+D)/2 : 20%
E : 20%
90 이상이면: Gold Class
80 이상이면: Silver Class
70 이상이면: Bronze Class
70 미만이면: Normal Class

 */

public class Test01 {

	public static void main(String[] args) {

		// int[] score = new int[5];

		int A = Integer.parseInt(args[0]);
		int B = Integer.parseInt(args[1]);
		int C = Integer.parseInt(args[2]);
		int D = Integer.parseInt(args[3]);
		int E = Integer.parseInt(args[4]);

		if (args.length < 5 || args.length > 5) {
			System.out.println("다시 입력하세요 1번째");
		}

		int cnt = 0;
		if (args.length == 5) {

			for (int i = 0; i < args.length; i++) {
				// score[i] = Integer.parseInt(args[i]);
				if (Integer.parseInt(args[i]) < 10 || Integer.parseInt(args[i]) > 99) {
					// System.out.println("점수"+args[i]);
					cnt++;
					// System.out.println("카운트"+cnt);

				}

			}

			if (cnt > 0) {
				System.out.println("다시 입력하세요2");
			}

			double sum = 0;
			sum = ((A + B) / 2) * 0.6 + ((C + D) / 2) * 0.2 + (E * 0.2);
			System.out.println("평가점수: " + sum + "점");
			
			
			String result=null;
			switch((int)sum/10) {
			case 10:
			case 9: result="Gold Class"; break;
			case 8: result="Silver Class"; break;
			case 7: result="Bronze Class"; break;
			default: result="Normal Class"; break;
			}
			
			System.out.println("Class: "+result);
			
			

		}

	}
}
