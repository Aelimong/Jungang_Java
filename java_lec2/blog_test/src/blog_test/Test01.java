package blog_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
임의의 시험 점수를 입력(혹은 랜덤으로)받아 
90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 
60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */
public class Test01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시험점수를 입력하시오 : ");
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
		System.out.println("학점 : " + grade);

	}

}
