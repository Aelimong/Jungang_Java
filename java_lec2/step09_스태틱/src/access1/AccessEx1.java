package access1;
/*
 * 
 ����������

�����̺� �ܺ� ��Ű������ ���Ұ�
	
�ܺο��� ���� �����ϰ� �Ϸ��� �ۺ�
������ �����̺�
�Լ��� �ۺ�
	
 * 
 */
import access2.AccessEx3;
import access2.AccessEx4;

public class AccessEx1 extends AccessEx4 {
	
	private int x=10;
	private int y=20;

	public static void main(String[] args) {

		AccessEx1 a1=new AccessEx1();
		System.out.println(a1.x+"\t"+a1.y);  
		System.out.println(a1.a+"\t"+a1.b);  
		
		AccessEx2 a2=new AccessEx2();
		System.out.println(a2.x+"\t"+a2.y+"\t"+a2.a);  
		
//		AccessEx3 a3=new AccessEx3();
//		System.out.println(a3.x+"\t"+a3.x1);  �ٸ� ��Ű�� ����Ϸ��� import�������(��Ʈ��+�����̽���)
//		                                      x1�� ����Ʈ �����ڶ� �ٸ� ��Ű������ ���Ұ�
		
		AccessEx3 a3=new AccessEx3();
		System.out.println(a3.x+"\t"+a3.y);
		
//		AccessEx4 a4=new AccessEx4();
//		System.out.println(a4.x);    //protected x�� ��Ű���� ����� �� �� ���� / ���� ��Ű�� �ȿ��� �����Ӱ� ��밡�� 
		
	}
	
	
	//

}
