package array;

public class ArrayEx4 {

	public static void main(String[] args) {

		int [] num= new int[3];                //?????3��°�����?????
		num[0]=Integer.parseInt(args[0]);
		num[1]=Integer.parseInt(args[1]);
		num[2]=Integer.parseInt(args[2]);
		
		//�ִ밪 �ּҰ� 
		
		int max=num[0];
		int min=num[0];
		
		for(int i=1; i<num.length; i++) {
			//0��° ���� �ڱ� �ڽ��̶� ���� �ʿ������ 1��° ����� ����
		if(num[i] > max )    max=num[i];
		if(num[i] < min )    min=num[i];
		
	}
                System.out.println("�ִ밪 : "+max);
                System.out.println("�ּҰ� : "+min);
		
		
		
		
		
		
}
}

