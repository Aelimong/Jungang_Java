package methodex;
//call by name 
public class MethodEx1 {

	
	public static void view() {
		System.out.println("hello");
		//return; //�������� void�� ��  ���� ����ϰ� �����±���( ���� ���� ������ ���� ���� ��)
		//�Լ�:�޼���	
	}
	
	public static void star() {
		System.out.println("******");
	}
	
	
	public static void main(String[] args) {
  //�����Լ� �ȿ� �̸��� �ִ� ��
		view();
        star();
        view();
        star();
        
      //public static ~~~ �Լ� �ȿ� �Լ��� �������� ����
		
	}

}
