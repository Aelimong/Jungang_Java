package test;
/*
 2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성

--출력
합은 정수형으로 평균은 실수형으로 출력 하시오.
total=325
average=16.25


 */
public class Test03 {

	public static void main(String[] args) {

		int[][] arr2 = { 
				{ 5, 5, 5, 5, 5 },
				{ 10, 10, 10, 10, 10 }, 
				{ 20, 20, 20, 20, 20 }, 
				{ 30, 30, 30, 30, 30 } };
	
		
		int sum=0;
		double avg=0.0;
		for(int i=0; i<arr2.length; i++) {
	
			for(int j=0; j<arr2[i].length; j++) {
				sum+=arr2[i][j];
			}
			  avg=(double)sum/(arr2.length*arr2[i].length);
		} 
		
		  System.out.println("total="+sum);	
		  System.out.printf("average=%.2f",avg);


		
	}

}
