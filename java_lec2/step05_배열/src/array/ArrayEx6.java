package array;
//2���� �迭

public class ArrayEx6 {

	public static void main(String[] args) {

	int[][] num=new int[][] {
		                    {10, 40, 70, 100},  //num�� 0��°��
		                    {20, 50, 80, 110},  //num�� 1��°��
		                    {30, 60, 90, 120}   //num�� 2��°��       //ǥ, ���̺� , 3�� 4��
	                        };
	                        
	   for(int i=0; i<num.length; i++) {                  //�ܺ��� for���� �� ��ȸ
  		   for(int j=0; j<num[i].length; j++) {          //������ for���� �� ��ȸ
			   System.out.print(num[i][j]+" ");
		   }
  		 System.out.println();
	   }
	                        

	
		
	}

}
