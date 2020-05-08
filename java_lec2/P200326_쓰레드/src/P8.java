class SumThread extends Thread{
	public int sum;
	private int start;
	private int end;
	
	public SumThread(int start, int end){
		this.start = start;
		this.end = end;
	}
	
	public void run() {

		for(int i=start; i<=end; i++) {
			sum+=i;
		}
		
	}
}


public class P8 {

	public static void main(String[] args) throws InterruptedException {

		SumThread th1 = new SumThread(1, 250000);
		SumThread th2 = new SumThread(250001, 500000);
		SumThread th3 = new SumThread(500001, 750000);
		SumThread th4 = new SumThread(750001, 1000000);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		th1.join(); //th1�� ���� �� ���� �� ������ , �� ����� �� ���� �ڿ� �� ���� ��ĥ �� �ְ� ����
		th2.join();  
		th3.join();
		th4.join();
		
		int total=th1.sum + th2.sum + th3.sum + th4.sum;
		
		System.out.println("1~100�� ������ ��: "+total);
		
		
		
	    System.out.println(th1.getName());
	    System.out.println(th2.getName());
	    System.out.println(th3.getName());
	    System.out.println(th4.getName());
	    
		
		
		
	
	}

}
