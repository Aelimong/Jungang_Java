//�޼ҵ� ����ƽ

class Calc{ //�����ϰ� ��ɸ� ���õ� Ŭ����
	        //�Ӽ��� ���µ� ���� new���� ������ϳ�
	
	static int plus(int a, int b){
		return a+b;
	} //������ �� �ص� �� �� ����

	static int minus(int a, int b) {
		return a-b;
	}
	
}
public class P15 {

	public static void main(String[] args) {

		int v1=10;
		int v2=20;
		
		int result = Calc.plus(v1, v2); //new ��ü ���� �� �ص� ��� ����~!
		System.out.println(result);
		
		// Math.log(100);//�ž�Ŭ�������� ��� ����ƽ
		                 // Ŭ���� �ȿ� �Ӽ��� ������ ���� �ʿ䰡 ���� ������
		

		
	}

}
