package test;

public class Test02 {

	public static void main(String[] args) {
//
//		for(int i=0; i<=10; i++) {
// 			for(int j=0; j<=i; j++) {
// 				System.out.print("*");
// 			}
// 			System.out.println();
// 		}
//		
		int i=0,j=0;
		while(i<=10) {
			j=0;
			while(j<=i) {
				System.out.print("*");
				++j;
			}
			System.out.println(" ");
			++i;
		}
		
		
		
		
// 		int i=0;
// 		int j=0;
//		while(i<=10) {
//			++i;
//			while(j<=i) {
//			++j;
//			System.out.println("*");
//		}
//		System.out.println(" ");
//	   }
//
//
////	int n=0;
//	while(n<10 ) {
//		++n;	
//	System.out.println("hello java");
		

}
}