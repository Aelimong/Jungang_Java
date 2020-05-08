import java.awt.*;

class BeepThread extends Thread{
	public void test(){
		
	}
	
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try{
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		
		
	}
}



public class BeepPrintExample {

	public static void main(String[] args) {

		Thread thread= new BeepThread();
		thread.start();
		
		
		for(int i=0; i<5; i++) {
			System.out.print("띵"+" ");
			try {
				Thread.sleep(500); //Thread 클래스의 static 메소드,객체 생성 없이 사용가능!
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
