package blog_test;

//다이아몬드 만들기
public class Cross3 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int result = 1;
		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {
				for (int j = 2; j < arr[i].length - 2; j++) {
					arr[i][j] = result;
					result++;
				}
			} else if (i == 1) {
				for (int j = 1; j < arr[i].length - 1; j++) {
					arr[i][j] = result;
					result++;
				}
			} else if (i == 2) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = result;
					result++;
				}
			} else if (i == 3) {
				for (int j = 1; j < arr[i].length - 1; j++) {
					arr[i][j] = result;
					result++;
				}
			} else {
				for (int j = 2; j < arr[i].length - 2; j++) {
					arr[i][j] = result;
					result++;
				}
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
