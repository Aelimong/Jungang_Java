//쓰레드 만드는 방법2
class TestThread2 implements Runnable{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i+"반갑습니다");
		}
	}
	
}
public class P4 {

	public static void main(String[] args) {

		TestThread2 th2 = new TestThread2();
		Thread aa=new Thread(th2);
		//new Thread(th2).start();
		aa.start();
		
		
		
		for(int i=0; i<100; i++) {
			System.out.println(i+"안녕하세요");
		}
	}

}
