package blog_test;
//1. 대각선 채우기

public class Cross1 {

	public static void main(String[] args) {
		
		int[][] arr=new int[5][5];
		int result=1;
		
		for(int k=0; k<9;k++) {
			for(int i=0; i<5; i++) {
				
				int j=k-i;
				if(j>=0 && j<5) {
					arr[i][j]=result;
					result++;
				}
				
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
			
		
		
	}

}
