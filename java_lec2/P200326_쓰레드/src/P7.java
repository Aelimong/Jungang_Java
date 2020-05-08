//동기화 처리하는 방법~~
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
		          //쓰레드인 경우에 한해서 싱크로나이즈드를 걸 수있다.
                  //동기화 됐다는 뜻...
		//스레드1 들어오고 다음 스레드2 들어오려고 하면 락걸림 ...스레드1 실행되고 나가야지 대기중이던 스레드2들어옴
		//DeadLock : 만약 스레드1에 문제 생겨서 안에서 멈추면 그 상태로 2도 무한 멈춰있는 경우
		
		System.out.println("실행코드들...");
		System.out.println("실행코드들...");
		//동기화할 필요없는 코드들이 섞여있는 경우, 1)싱크로나이즈드 풀어주고
	
					 //어떤 주소값이 들어가도 상관없는데
		             //2)주소값을 넣고 주소값이 같은 애들끼리 동기화 시켜주는 것
		synchronized (SyncObject.xxx) {
			Data7.v1++; //공통된 메모리????(Data7의 v1이 static 글로벌변수니까~~~)	
			System.out.println(Data7.v1);	
		}
		
		System.out.println("실행코드들...");
		System.out.println("실행코드들...");
		
	}
	
}

class SyncObject{
	static Object xxx= new Object(); //static이라 딱 하나의 주소값을 가지게 됨 

}




public class P7 {

	public static void main(String[] args) {
//		new Thread7().start();
//		new Thread7().start();
//		new Thread7().start(); //쓰레드 3개가 동시에 도는 것. 메모리공유 안함
//		
		Thread7 th1 = new Thread7();
		th1.setName("1번쓰레드.....");

		Thread7 th2 = new Thread7();
		th2.setName("2번쓰레드.....");

		Thread7 th3 = new Thread7();
		th3.setName("3번쓰레드.....");
		
		th1.start();
		th2.start();
		th3.start();
		
		
		
	
	}

}
