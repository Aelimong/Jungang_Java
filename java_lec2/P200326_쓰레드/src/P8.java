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
		
		th1.join(); //th1이 끝날 때 까지 멈 춰있음 , 다 계산이 다 끝난 뒤에 한 번에 합칠 수 있게 만듬
		th2.join();  
		th3.join();
		th4.join();
		
		int total=th1.sum + th2.sum + th3.sum + th4.sum;
		
		System.out.println("1~100만 까지의 합: "+total);
		
		
		
	    System.out.println(th1.getName());
	    System.out.println(th2.getName());
	    System.out.println(th3.getName());
	    System.out.println(th4.getName());
	    
		
		
		
	
	}

}
