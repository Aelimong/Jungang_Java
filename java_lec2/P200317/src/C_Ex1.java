import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_Ex1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = Integer.parseInt(br.readLine());
		
		// score�� 95�̻��̸� A+ ��� , 90�̻� A
		// 85�̻� B+ 80�̻� B �׿ܿ� F

		if (score >= 95) {
			System.out.println("A+");
		} else if (score >= 90) {
			System.out.println("A");
		} else if (score >= 85) {
			System.out.println("B+");
		} else if (score >= 80) {
			System.out.println("B");
		} else {
			System.out.println("F");
		}

	}
}
