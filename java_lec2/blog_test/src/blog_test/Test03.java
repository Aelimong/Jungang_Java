package blog_test;
/*
for 문을 이용해서 
1부터 76까지의 합을 구하는 코드를 작성하자.
 */
public class Test03 {

	public static void main(String[] args) {

		int sum=0;
		for(int i=0; i<76; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
