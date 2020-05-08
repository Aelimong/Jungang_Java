/*
1.
for 문을 이용해서 
1부터 76까지의 합을 구하는 코드를 작성하자.

2.구구단을 출력해보자

3.피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 
예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서 
1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 
계산하는 프로그램을 완성하시오.
 */
public class L_Ex1 {

	public static void main(String[] args) {
       /*1.
		int sum=0;
		for(int i=1; i<77; i++) {
			sum+=i;
		} System.out.println(sum);
		
		2.
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));	
			}
			 System.out.println();
		}
		
		
		3.
		int n1=1;
		int n2=1;
		int res=0;
		
		for(int i=3; i<=10; i++) {
			res=n1+n2;
			n1=n2;
			n2=res;	
		} System.out.println(res);
		
		*/
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print((i*j)+"\t");	
			}
			 System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
