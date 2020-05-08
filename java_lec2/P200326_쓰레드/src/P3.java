//쓰레드 만드는 방법1
class TestThread extends Thread {
	// Thread클래스의 run 메소드 오버라이딩 해서 사용해야함
	public void run() {

		for (int i = 0; i < 100; i++) {
			
			System.out.println(i + "안녕하세요");
			
			try {
				Thread.sleep(300); // 한 줄 출력후 잠깐 멈추는 것, 최소 0.3초라서 그 이상이 될 수도 있다
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}

public class P3 {

	public static void main(String[] args) throws InterruptedException {

		TestThread th1 = new TestThread();
		// th1.run(); 잘못된 호출,직접적으로 호출하면 안 됨!
		th1.start(); // 쓰레드 클래스에 속한 start메소드를 호출해야함~~~

		for (int i = 0; i < 100; i++) {
			System.out.println(i + "반갑습니다");
			Thread.sleep(100); // 0.1초간 멈추는 것
		}

	}

}
