package methodex;

public class MethodEx5 {

	public static void show1() {   //call by name 
		System.out.println("�ȳ��ϼ���");
		// return; void�� ������ ���� ���� 
	}
	
                               //�� �Ű�����
	public static void show2(char c, int i) {  //call by value
	System.out.println("Ÿ�� : "+c);
	System.out.println("�ڵ�: "+i);
	}
	
	public static String show3() {
		return "hello";
	}
	
	public static float show4(int a,int b, int c) {
		return (a+b+c)/3.0f;
	}
	
	
	
	public static void main(String[] args) {
		show1();
		show2('A', 25); //���� �Ű�����
		String s=show3();
		System.out.println("���ϰ� : "+s);
		
		float k=show4(15, 45, 73);
        System.out.printf("���ϰ� : %.2f\n", k);		
		
        
        
        
        
        
	}





}
