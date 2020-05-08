package blog_test;
//2. ㄹ자 채우기

public class Cross2 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int k = 1;
		boolean a = true;

		for (int i = 0; i < arr.length; i++) {

			if (a == true) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = k;
					k++;
				}
			a = false;

			} else {
				for (int j = 4; j>=0; j--) {
					arr[i][j] = k;
					k++;
				}
			 a = true;
			}
			
		}
		
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
