package blog_test;
//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
//몇까지 더해야 총합이 100이상이 되는지 구하시오.

public class Test12 {

	public static void main(String[] args) {
       
		int i=0, s=1, sum=0;
		while(sum<100) {
			sum+= ++i *s;
			s=-s;
		}
		System.out.printf("sum: %d, i:%d",sum,i);
		
		
		
		
		
		
		
		/*
		int sum=0;
		int n=0;
		while(sum<100) {
			++n;
        	if(n%2==0) sum-=n;
        	else sum+=n;  
        }
		System.out.println(sum);
        */

	}
}
