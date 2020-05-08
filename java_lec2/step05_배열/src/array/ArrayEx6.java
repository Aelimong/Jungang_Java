package array;
//2차원 배열

public class ArrayEx6 {

	public static void main(String[] args) {

	int[][] num=new int[][] {
		                    {10, 40, 70, 100},  //num의 0번째방
		                    {20, 50, 80, 110},  //num의 1번째방
		                    {30, 60, 90, 120}   //num의 2번째방       //표, 테이블 , 3행 4열
	                        };
	                        
	   for(int i=0; i<num.length; i++) {                  //외부의 for문의 행 순회
  		   for(int j=0; j<num[i].length; j++) {          //내부의 for문의 열 순회
			   System.out.print(num[i][j]+" ");
		   }
  		 System.out.println();
	   }
	                        

	
		
	}

}
