package methodex;

public class MethodEx8 {

	
	
	public static void view1() {
		System.out.println("static method");
	}
	
	public void view2() {
		System.out.println("non-static method");
	}
	
	public static void main(String[] args) {
		//Ŭ���� �޼���(class method): ��ü ���� ȣ�� ����
		view1();  //�ڱ� �ڽ��� �޼��忡 ������ ���� Ŭ���� �̸� ���� ����
		
		//Ŭ������ ������Ʈ�� �ν��Ͻ�??? Ŭ������ �ν��Ͻ��� ������Ʈ
		
		MethodEx8 ob=new MethodEx8();  //��ü����
		ob.view2();    // �ν��Ͻ� �޼���(instance method)
		               // �ݵ�� ��ü�� �����ϰ� �޼��带 ȣ���ؾ���
		
		
	}

}
