class TestThread5 extends Thread{
	public void run() {
		this.setPriority(1); //1���� ..�ִ� 10����(������ ����) ....���۷����� �ý��ۿ� ���� �ٸ�
		                     //���ڰ� ���� ���� �켱������ ����!!!! ��������� CPU�� �켱������ ���� ��~
		for(int i=0; i<100; i++) {
			System.out.println(i+"�ȳ��ϼ���");
		}
	}
}

class TestThread55 extends Thread{
	public void run() {
		this.setPriority(10);
		for(int i=0; i<100; i++) {
			System.out.println(i+"�ݰ����ϴ�");
		}
	}
}

public class P5 {

	public static void main(String[] args) {
		TestThread5 th5 = new TestThread5();
		th5.start();
		
		TestThread55 th55= new TestThread55();
		th55.start();
		
	}

}
