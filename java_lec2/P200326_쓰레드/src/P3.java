//������ ����� ���1
class TestThread extends Thread {
	// ThreadŬ������ run �޼ҵ� �������̵� �ؼ� ����ؾ���
	public void run() {

		for (int i = 0; i < 100; i++) {
			
			System.out.println(i + "�ȳ��ϼ���");
			
			try {
				Thread.sleep(300); // �� �� ����� ��� ���ߴ� ��, �ּ� 0.3�ʶ� �� �̻��� �� ���� �ִ�
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}

public class P3 {

	public static void main(String[] args) throws InterruptedException {

		TestThread th1 = new TestThread();
		// th1.run(); �߸��� ȣ��,���������� ȣ���ϸ� �� ��!
		th1.start(); // ������ Ŭ������ ���� start�޼ҵ带 ȣ���ؾ���~~~

		for (int i = 0; i < 100; i++) {
			System.out.println(i + "�ݰ����ϴ�");
			Thread.sleep(100); // 0.1�ʰ� ���ߴ� ��
		}

	}

}
