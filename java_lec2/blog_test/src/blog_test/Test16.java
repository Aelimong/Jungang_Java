package blog_test;

/*

intŸ���� ���� num �� ���� ��, 
�� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�. 
���� ���� num�� ���� 12345���, ��1+2+3+4+5���� ����� 15�� ����϶�. 

[����] ���ڿ��� ��ȯ���� ���� ���ڷθ� ó���ؾ� �Ѵ�.
(API�� ������� �ʴ´�. �˰������θ� ó��)

 */
public class Test16 {

	public static void main(String[] args) {

		// 10000 2000 300 40 5
		int num = 12345;

		int a = num / 10000;

		num = num % 10000;
		int b = num / 1000;

		num = num % 1000;
		int c = num / 100;

		num = num % 100;
		int d = num / 10;

		int e = num % 10;

		System.out.println(a + b + c + d + e);

	}

}
