//����ȭ ó���ϴ� ���~~
class Thread7 extends Thread{
	int v1=0;
	public void run() {
	
		for(int i=0; i<1000; i++) {
			Data7.someMethod(this.getName());
		}
		
	}
}

class Data7{
	static int v1;
	public static void someMethod(String name) { 
		          //�������� ��쿡 ���ؼ� ��ũ�γ�����带 �� ���ִ�.
                  //����ȭ �ƴٴ� ��...
		//������1 ������ ���� ������2 �������� �ϸ� ���ɸ� ...������1 ����ǰ� �������� ������̴� ������2����
		//DeadLock : ���� ������1�� ���� ���ܼ� �ȿ��� ���߸� �� ���·� 2�� ���� �����ִ� ���
		
		System.out.println("�����ڵ��...");
		System.out.println("�����ڵ��...");
		//����ȭ�� �ʿ���� �ڵ���� �����ִ� ���, 1)��ũ�γ������ Ǯ���ְ�
	
					 //� �ּҰ��� ���� ������µ�
		             //2)�ּҰ��� �ְ� �ּҰ��� ���� �ֵ鳢�� ����ȭ �����ִ� ��
		synchronized (SyncObject.xxx) {
			Data7.v1++; //����� �޸�????(Data7�� v1�� static �۷ι������ϱ�~~~)	
			System.out.println(Data7.v1);	
		}
		
		System.out.println("�����ڵ��...");
		System.out.println("�����ڵ��...");
		
	}
	
}

class SyncObject{
	static Object xxx= new Object(); //static�̶� �� �ϳ��� �ּҰ��� ������ �� 

}




public class P7 {

	public static void main(String[] args) {
//		new Thread7().start();
//		new Thread7().start();
//		new Thread7().start(); //������ 3���� ���ÿ� ���� ��. �޸𸮰��� ����
//		
		Thread7 th1 = new Thread7();
		th1.setName("1��������.....");

		Thread7 th2 = new Thread7();
		th2.setName("2��������.....");

		Thread7 th3 = new Thread7();
		th3.setName("3��������.....");
		
		th1.start();
		th2.start();
		th3.start();
		
		
		
	
	}

}
