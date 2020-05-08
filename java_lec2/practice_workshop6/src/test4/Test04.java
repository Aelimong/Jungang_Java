package test4;

public class Test04 {

	public static void main(String[] args) {
		//1) eclipse Argument 에서 1~5까지의 두 개의 정수형 데이터를 입력 받는다.
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        
        //4) 입력 받은 두 개의 정수를 이용하여 2차원 배열을 생성한다.
        int array[][]=new int[a][b]; //a,b는 행열의 개수 정해주는 것(두 개의 정수를 이용하여 배열 만드는 거니까)
        

        System.out.println(a+" "+b); //1-1)두 개의 정수값 출력
        
       //2) 입력 받은 데이터가 2개 미만 또는 2개 초과로 입력 하면 “다시 입력 하세요” 출력
		if(args.length<2 || args.length>2) {
			System.out.println("다시 입력 하세요 ");
			return; //잘못입력했으면 프로그램 멈춰줘야 함
		} 
		
		//3) 1~5이외의 숫자가 입력 될 경우 “숫자를 확인 하세요” 출력
		if((a<1 || a>5)&&(b<1 || b>5)) {
			System.out.println("숫자를 확인 하세요");
			return;
			
		} 

        	 int sum=a+b; //array[0][0],array[0][1] 값이 들어와 있으니까
			 double avg=0;
			 for(int i=1; i<array.length; i++) {               
		  		   for(int j=0; j<array[i].length; j++) {
		  			// 5) 2차원 배열에 1~5까지의 랜덤한 숫자(중복허용)를 넣는다.
		  			 int rd=(int)(Math.random()*5+1);
		  			 array[i][j]=rd;
		  			 //array[1][0], array[1][1] 두 군데에 랜덤 수 넣는것
		  			 
					 System.out.print(array[i][j]+" "); // 6) 배열의 내용을 출력 한다.
					 
					// 7) 배열의 총합과 평균을 실수형으로 출력 한다.
					 sum=sum+array[i][j];
					 avg=sum/(int)(array[i].length*array[j].length);
					               //행의 개수와 열의 개수 곱하기
				   } 
		  		 System.out.println();
	
			   } 
			 System.out.println("sum="+sum);
		     System.out.println("avg="+avg);
			 

		

		
	}

}
