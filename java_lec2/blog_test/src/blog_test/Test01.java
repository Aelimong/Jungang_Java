package blog_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
������ ���� ������ �Է�(Ȥ�� ��������)�޾� 
90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 
60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Test01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���������� �Է��Ͻÿ� : ");
		int n;
		n = Integer.parseInt(br.readLine());
		char grade;
		switch (n / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("���� : " + grade);

	}

}
