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
			System.out.print("��"+" ");
			try {
				Thread.sleep(500); //Thread Ŭ������ static �޼ҵ�,��ü ���� ���� ��밡��!
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
