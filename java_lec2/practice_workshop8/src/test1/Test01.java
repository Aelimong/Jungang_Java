package test1;
/*
 * 
(A+B)/2 : 60%
(C+D)/2 : 20%
E : 20%
90 �̻��̸�: Gold Class
80 �̻��̸�: Silver Class
70 �̻��̸�: Bronze Class
70 �̸��̸�: Normal Class

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
			System.out.println("�ٽ� �Է��ϼ��� 1��°");
		}

		int cnt = 0;
		if (args.length == 5) {

			for (int i = 0; i < args.length; i++) {
				// score[i] = Integer.parseInt(args[i]);
				if (Integer.parseInt(args[i]) < 10 || Integer.parseInt(args[i]) > 99) {
					// System.out.println("����"+args[i]);
					cnt++;
					// System.out.println("ī��Ʈ"+cnt);

				}

			}

			if (cnt > 0) {
				System.out.println("�ٽ� �Է��ϼ���2");
			}

			double sum = 0;
			sum = ((A + B) / 2) * 0.6 + ((C + D) / 2) * 0.2 + (E * 0.2);
			System.out.println("������: " + sum + "��");
			
			
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
