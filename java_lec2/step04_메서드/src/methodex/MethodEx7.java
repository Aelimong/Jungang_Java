package methodex;
//call by reference : ������ ���� ����, ���� �ּ� ���� (���� �����Ϳ� �׼��� �� �� �ִ� �ڷ�)
//��ü �ڷ������� ���, Ŭ����, ������, �迭, �������̽�
public class MethodEx7 {

	
	public static void view1(String str) {
	System.out.println(str);
	}

	public static void view2(int[] num) {
            for(int n:num) {
            	System.out.println("������ view2�� num : "+n);
            }
		
         // 	System.out.println();
            num[2]=300;
            for(int n:num) {
            	System.out.println("������ view2�� num : "+n);
	}
	}
	
	
	public static void main(String[] args) {
		String str="happy";
		view1(str);   //�Լ�ȣ��
	
	
		
		int [] num= {10,20,30,40,50};
		for(int i:num)
		System.out.println("ȣ���� ������ num: "+i);
	
		view2(num);
		for(int i:num)
		System.out.println("ȣ���� ������ num: "+i);
		
		
		
	}

}
