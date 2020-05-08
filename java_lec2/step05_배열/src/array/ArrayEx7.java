package array;
//가변 배열 : 행이나 열이 가변적인 배열

public class ArrayEx7 {

	public static void main(String[] args) {

		
	int[][] num=new int[3][4]; {
   //1차원 2차원  //인트의 변수명 //비어있는 공간의 크기 설정              
	num[0]=	new int[] {10,20};
	num[1]=	new int[] {30,40,50,60};
	num[2]=	new int[] {70,80,90};
	//많이 사용 됨 / 객체자료형으로 만들어 사용해야하기 때문에
	

		
	   for(int i=0; i<num.length; i++) {                  //외부의 for문의 '행' 순회
  		   for(int j=0; j<num[i].length; j++) {          //내부의 for문의 '열' 순회
			   System.out.print(num[i][j]+" ");
		   }
  		 System.out.println();
	   }
	                        

	
		
	}

}
}
