
public class Ex3 {

	public static void main(String[] args) {
		// 1~10000������ 8�� ��� �����°�?
		// 8885 3��

		int cnt = 0;
		for (int i = 1; i <= 10000; i++) {
			int temp = i;

			while (temp != 0) {

				if (temp % 10 == 8) {
					cnt++;
				}
				temp = temp / 10;
			}
		}
		System.out.println("8�� ����: " + cnt);

	}

}
