package workout1;

/*
 [����10] ������ ���� �޼��带 �ۼ��ϰ� ����� �ϼ��Ͻÿ�
(1)���θ޼��忡�� �Ʒ� �޼��带 ȣ���ϰ� ȣ��޼��忡�� 
    ���� �����  �����Ұ� 
     sum(3,5)    /     sub(7,2)   /     mul(4,5)   /     div(7,3)
(2)�޼��忡�� ���� ������� ���θ޼��忡�� ����Ͻÿ�

[���� ��]
System.out.println("���ϱ� : " + sum(3,5));             

[���ȭ��]
���ϱ� : 8
��  �� : 5
���ϱ� : 20
������ : 2.33
 */


public class Memo3_q10 {
           //static ������(��ü)�� ������ �ʾ������� �� ������Ѵ�
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sub(int c, int d) {
		return c-d;
	}
	
	public static int mul(int e, int f) {
		return e*f;
	}
	
	public static double div(int h, int g) {
		return (h/(double)g);
	}
	
	public static void main(String[] args) {

	
	sum(3, 5);
	sub(7, 2);
	mul(4, 5);
	div(7, 3);
	
	System.out.println("���ϱ� : "+sum(3, 5));
	System.out.println("���� : "+sub(7, 2));
	System.out.println("���ϱ� : "+mul(4, 5));
	System.out.printf("������ : %.2f\n", div(7, 3));
	
	}

}
