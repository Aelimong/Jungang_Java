class TestThread5 extends Thread{
	public void run() {
		this.setPriority(1); //1부터 ..최대 10까지(윈도우 기준) ....오퍼레이팅 시스템에 따라 다름
		                     //숫자가 높을 수록 우선순위가 높음!!!! 평균적으로 CPU가 우선순위를 많이 줌~
		for(int i=0; i<100; i++) {
			System.out.println(i+"안녕하세요");
		}
	}
}

class TestThread55 extends Thread{
	public void run() {
		this.setPriority(10);
		for(int i=0; i<100; i++) {
			System.out.println(i+"반갑습니다");
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
