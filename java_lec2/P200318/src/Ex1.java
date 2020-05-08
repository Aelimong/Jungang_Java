  





public class Ex1 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		/*
		arr[0][0]=1;
		
		arr[1][0]=2;
		arr[1][1]=3;
		
		arr[2][0]=4;
		arr[2][1]=5;
		arr[2][2]=6;
		
		arr[3][0]=7;
		arr[3][1]=8;
		arr[3][2]=9;
		arr[3][3]=10;
		
		arr[4][0]=11;
		arr[4][1]=12;
		arr[4][2]=13;
		arr[4][3]=14;
		arr[4][4]=15;
		
		
		
		*/
		
		
		int res=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<=i; j++) {
				++res;
				arr[i][j]=res;
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
			
		}
		
		/*
		
		for(int i=0; i<arr.length; i++) {
			for(int x=0; x<arr[i].length; x++) {
				System.out.print(arr[i][x]+" ");
			}
			System.out.println();
		}
		
		*/
		
		
		
		
	}

}
