//�迭 �޸�
public class P9 {

	public static void main(String[] args) {
		int[] arr= new int[5]; //int[] ����Ÿ�� , heap�޸𸮿� ����
		
		arr[0]=10;	
		arr[3]=10;
		
		arr= null;
		arr[3]=50;
		//java.lang.NullPointerException ������ ������ �ƴ����� ����� ����
		//arr�� � �޸� �ּ�(heap)�� �������� �ʾƼ�(null) ���� ���� �� ����
		
		
		
	
	}

}
