package test;
/*
 2���� �迭 arr2�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ۼ�

--���
���� ���������� ����� �Ǽ������� ��� �Ͻÿ�.
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
