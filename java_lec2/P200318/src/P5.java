
public class P5 {

	public static void main(String[] args) {
		byte v1 = 10;
		short v2 = 20;
		int v3 = 30;
		long v4 = 50;
		
		v3=v1; //���°� �ٸ��� ������ �ڵ�����ȯ ��
		v1=(byte)v3; //���� ���� ū ���� �ִ� �� ���������� ���� �ʾ� ��������ȯ �ʿ�@@@
		
		double v5 = 3.333;
		int v6 = (int)v5; //��������ȯ�� �ص� �����ٴ� Ȯ���� ���� ���� �ؾ���(���� �ս��� ���� ��찡 �ֱ� ������)

		System.out.println(v6);
		

	}

}
