class A1{
	
	static int plus(final int a, final int b) { //final ������ ������ �� ���� ����� ��(������ Ȯ��)
		return a+b;
	}
	
}


public class P1 {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 20;
		int result=A1.plus(v1, v2);
		System.out.println(result);

	}

}
