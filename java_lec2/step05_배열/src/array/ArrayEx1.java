package array;
//1���� �迭
//String name="ȫ�浿"
//�迭 : ������ �ڷ����� ���ӵ� ������


public class ArrayEx1 {

	public static void main(String[] args) {

		int[] num=new int[5];  //5���� �������� ������ ������ �迭���� , new������: ��ü ���� == �����ڷ����̴� / ���� �����Ϳ� �׼����� �� �ִ� �ڷ�
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		for(int i=num.length-1; i>=0; i--) {
			System.out.println(num[i]);
		}
		
		
		for(int n : num) {
			//�������� n�� ���� ��������
			System.out.print(n+" ");
	
		}
		
	}

}
