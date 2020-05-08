package blog_test;
//1~10000사이에 8이 몇번 나오는가?
public class Test21 {

	public static void main(String[] args) {		
		int sumCnt=0;
		
		for(int i=1; i<=10000; i++) {
		
			if(i%10==8) {
				sumCnt+=1;
			}
			if((i/10)%10==8) {
				sumCnt+=1;
			}
			
			if((i/100)%10==8) {
				sumCnt+=1;
			}
			
			if(i/1000==8) {
				sumCnt+=1;
			}
		} System.out.println(sumCnt);
		
		
	}

}
