package test4;

public class Test04 {

	public static void main(String[] args) {
		//1) eclipse Argument ���� 1~5������ �� ���� ������ �����͸� �Է� �޴´�.
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        
        //4) �Է� ���� �� ���� ������ �̿��Ͽ� 2���� �迭�� �����Ѵ�.
        int array[][]=new int[a][b]; //a,b�� �࿭�� ���� �����ִ� ��(�� ���� ������ �̿��Ͽ� �迭 ����� �Ŵϱ�)
        

        System.out.println(a+" "+b); //1-1)�� ���� ������ ���
        
       //2) �Է� ���� �����Ͱ� 2�� �̸� �Ǵ� 2�� �ʰ��� �Է� �ϸ� ���ٽ� �Է� �ϼ��䡱 ���
		if(args.length<2 || args.length>2) {
			System.out.println("�ٽ� �Է� �ϼ��� ");
			return; //�߸��Է������� ���α׷� ������� ��
		} 
		
		//3) 1~5�̿��� ���ڰ� �Է� �� ��� �����ڸ� Ȯ�� �ϼ��䡱 ���
		if((a<1 || a>5)&&(b<1 || b>5)) {
			System.out.println("���ڸ� Ȯ�� �ϼ���");
			return;
			
		} 

        	 int sum=a+b; //array[0][0],array[0][1] ���� ���� �����ϱ�
			 double avg=0;
			 for(int i=1; i<array.length; i++) {               
		  		   for(int j=0; j<array[i].length; j++) {
		  			// 5) 2���� �迭�� 1~5������ ������ ����(�ߺ����)�� �ִ´�.
		  			 int rd=(int)(Math.random()*5+1);
		  			 array[i][j]=rd;
		  			 //array[1][0], array[1][1] �� ������ ���� �� �ִ°�
		  			 
					 System.out.print(array[i][j]+" "); // 6) �迭�� ������ ��� �Ѵ�.
					 
					// 7) �迭�� ���հ� ����� �Ǽ������� ��� �Ѵ�.
					 sum=sum+array[i][j];
					 avg=sum/(int)(array[i].length*array[j].length);
					               //���� ������ ���� ���� ���ϱ�
				   } 
		  		 System.out.println();
	
			   } 
			 System.out.println("sum="+sum);
		     System.out.println("avg="+avg);
			 

		

		
	}

}
