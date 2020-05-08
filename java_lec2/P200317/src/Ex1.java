
public class Ex1 {

	public static void main(String[] args) {
		
		for(int x=2; x<=100; x++) {
			
			boolean isPrime = true;
			for(int y=2; y<x; y++) {
				if(x%y==0) {
					isPrime=false;
					break;
					
				}
			}
			
			if(isPrime) {
				System.out.println(x+" ´Â ¼Ò¼ö");
			}
			
			
		}
		
		
		

	}

}
