package interfaceex;

//------------------------------------------------------�߻�(�̿ϼ�)Ŭ����
interface Shape{
	/*final*/ int r=10;  //������ ������ ���ָ� �ȴ�
	/*abstract*/ public void draw();
	/*abstract*/abstract public void erase();
//��������� ū �ǹ̸� ���� �ʴ´�
}

class Circle implements Shape{  //���ø���Ʈ -->����
	@Override
	public void draw() {          //���� ������: ������ �������̵� �ؾ���!!! ������Ʈ �� �������� ���� �Լ� ������
		System.out.println("�������� "+r+"�� ���� �׸���");
	}
	
	@Override
	public void erase() {
		System.out.println("���� �����");
		
	}
}


public class InterfaceEx1 {

	public static void main(String[] args) {
		Circle cir=new Circle();
		cir.draw();
		cir.erase();
		
		
	}

}



////------------------------------------------------------�߻�(�̿ϼ�)Ŭ����
//abstract class Shape{
//	final int r=10;
//	abstract public void draw();
//	// ���Ǹ� ��Ÿ���� {} �������� ���� ������ �ϼ��� �����̱� ������
//	abstract public void erase();
//
//}
//
//class Circle extends Shape{
//	@Override
//	public void draw() {          //���� ������: ������ �������̵� �ؾ���!!! ������Ʈ �� �������� ���� �Լ� ������
//		System.out.println("�������� "+r+"�� ���� �׸���");
//	}
//	
//	@Override
//	public void erase() {
//		System.out.println("���� �����");
//		
//	}
//}
//
//
//public class InterfaceEx1 {
//
//	public static void main(String[] args) {
//		Circle cir=new Circle();
//		cir.draw();
//		cir.erase();
//		
//		
//	}
//
//}




//----------------------------------------------�Ϲ�Ŭ����
//class Shape{
//	final int r=10;
//	public void draw() {}
//	public void erase() {}
//
//}
//
//class Circle extends Shape{
//	@Override
//	public void draw() {
//		System.out.println("�������� "+r+"�� ���� �׸���");
//	}
//	
//	@Override
//	public void erase() {
//		System.out.println("���� �����");
//		
//	}
//}
//
//
//public class InterfaceEx1 {
//
//	public static void main(String[] args) {
//		Circle cir=new Circle();
//		cir.draw();
//		cir.erase();
//		
//		
//	}
//
//}
