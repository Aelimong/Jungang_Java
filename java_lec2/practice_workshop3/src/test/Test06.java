package test;
/*
1부터 100까지 더하는 프로그램을 작성 한다. 단, eclipse에서 argument로 1자리 정수형 데
이터를 입력 받아 입력 받은 수의 배수만 더한다.

입력 예1: 5
5,10,15, … , 100=1050

 * 
 * 
 * 
 * 
 */
public class Test06 {

	public static void main(String[] args) {

		int n=Integer.parseInt(args[0]);
     	int sum=0;
     	
	   for(int i=1; i<=100; i++) {
		   if(i%n==0) 
			sum+=i;
	   } System.out.println(sum);
		
	   
	   /*
	    * sum+=i;
		    
		 switch(i%2) {
		 case 1: odd+=i; break;
		 case 0: even+=i; break;
	     }
	    */
	   
	}

}
