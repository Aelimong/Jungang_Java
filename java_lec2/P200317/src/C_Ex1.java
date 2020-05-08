import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_Ex1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("점수를 입력하시오: ");
		int score = Integer.parseInt(br.readLine());
		
		// score가 95이상이면 A+ 출력 , 90이상 A
		// 85이상 B+ 80이상 B 그외에 F

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
