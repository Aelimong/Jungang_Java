package blog_test;

//�� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class Test14 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i + j == 6) {
					System.out.println(i + "+" + j + "=" + (i + j));
				}
			}
		}

	}

}
