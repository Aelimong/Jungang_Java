//���ٽ�: ���� ���� ���������� ���� ��,1~3�� ������ �ʿ��� ��
//(�ڵ� ����ȭ�� ����)

interface Callable{ 
	public void call(int a, String str); //��� �������̵� ������� 
}

/* ��ù��° ���
class Test3 implements Callable{
	
	
	public void call() {
	System.out.println("���� ����~~~~~ ������ �ڵ�...");	
	}
}
*/



public class P7 {

	public static void main(String[] args) {
		
		/*�ڵι�° ���			//�͸�ü
		Callable x =new Callable() {
			int a=10;
			@Override
			public void call() {
				this.a=20;
				System.out.println(a+" ���� ������ �ڵ�");
				
			}
		}; 
		*/
		
		//���ٽ�
		Callable x = (a,str) -> {
			System.out.println(a+" ���� ������ �ڵ� "+str);
		};
		
		//�������� ���� ������ �޶� ��ü���� ����!
		x.call(10,"�ָ�");
		
		
		
		
	}

}
