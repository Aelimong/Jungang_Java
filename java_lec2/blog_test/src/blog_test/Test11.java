package blog_test;
/*
 
1부터 100까지 출력을 하고 난 다음에
다시 거꾸로 100에서부터 1까지 출력을 하는 프로그램을 작성해 보자.

 */
public class Test11 {

	public static void main(String[] args) {
     for(int i=1; i<=100; i++) {
    	 System.out.print(i+" ");
     }
     System.out.println();
     
	for(int j=100; j>0; j--) {
		System.out.print(j+" ");
	}
     
     
     
     
	}

}
