//동기화 문제가 발생하는 경우
class Data1{
	public static int count=0;
	
}

class Th1 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			Data1.count++;
			System.out.println(Data1.count);
		}
		
	}
}

class Th2 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			Data1.count++;
			System.out.println(Data1.count);		
		}
	}
}

public class P6 {

	public static void main(String[] args) {

		new Th1().start();
		new Th2().start();
		
		
	}

}
