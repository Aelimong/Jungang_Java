class BBB{
	
}


public class P9 {

	public static void main(String[] args) {


		BBB b=new BBB();
		int value = b.hashCode(); //�޸��� �ּҰ��� �������� �������� ����
		System.out.println(value);
		System.out.println(b); //16������
		
		String str1=new String("�ȳ��ϼ���");
		System.out.println(str1.hashCode());
		
		String str2=new String("�ȳ��ϼ���");
		System.out.println(str2.hashCode());
		

		
		
		
		
		
	}

}
