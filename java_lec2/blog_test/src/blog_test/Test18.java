package blog_test;

/*18.
�ڿ��� 1���� �����ؼ� ��� Ȧ���� 3�� ����� ¦���� ���� ������. 
�� ���� ����(���� ������ ��) 1000�� �Ѿ���� , 
�׸��� 1000�� �Ѿ ���� �󸶰� �Ǵ��� ����Ͽ� ����ϴ� ���α׷��� �ۼ��� ����.
*/
public class Test18 {

	public static void main(String[] args) {

		/*
	 int sum=0; int sum2=0; 
	 for(int i=1; i<=55; i++) { 
		 if(i%2!=0) { 
			 sum+=i; 
			 } else
     	 if(i%3==0 && i%2==0) {
	    	 sum2+=i; 
		 } System.out.println(sum+sum2);
	 }
	
		*/

		
		int i = 0;
		int sum = 0;

		while (true) {
			if (i % 2 != 0 || (i % 3 == 0 && i % 2 == 0)) {
				sum += i;
			}
			if (sum > 1000) {
				System.out.println(i+"�� ��������");
				System.out.println("1000�� �Ѿ ��: "+sum);
				break;
			}
			i++;
		}
		
		
		

	}

}
