package book_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("5���� ���� ������ �Է��Ͻʽÿ�");
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[i] = n;
		}

		/*
		 * 
		 * 
		 * for (int i = 0; i < arr.length; i++) { System.out.println((i + 1) +
		 * "��° ����� ������ " + arr[i]); }
		 * 
		 * int tmp = 0; 
		 * for (int f = 0; f < arr.length - 1; f++) {
		 * 	 for (int s = f + 1; s< arr.length; s++) { 
		 *  		if (arr[s] > arr[f]) {
							tmp = arr[f]; 
							arr[f] = arr[s];
		 * 					arr[s] = tmp; } 
		 *   }
		 *         tmp = arr[0]; 
		 * }
		 * 
		 * System.out.println("���� ���� ������ " + tmp + "�� �Դϴ�");
		 * 
		 */

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "��° ����� ������ " + arr[i]);
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println("���� ���� ������ " + max + "�� �Դϴ�");

	}

}
