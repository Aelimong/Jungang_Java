package test;
/*
1���� 100���� ���ϴ� ���α׷��� �ۼ� �Ѵ�. ��, eclipse���� argument�� 1�ڸ� ������ ��
���͸� �Է� �޾� �Է� ���� ���� ����� ���Ѵ�.

�Է� ��1: 5
5,10,15, �� , 100=1050

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
