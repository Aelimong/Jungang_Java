package test20;
/*
(1)package���� test20�� �ϰ� CircleEx.java������ �ϳ� ���� 
Ŭ������ 2�� �߰��Ͻÿ�

(2)Ŭ������ : Circle
-r:int

+Circle(r:int)
+getSize():double

(3) Ŭ������ : CircleEx
Circle ob=new Circle(10);
System.out.println("���ǳ��� : " + ob.getSize());

(3)���ȭ��
������ 10�� ���� ���̴� 314.16�Դϴ�
 
 */
class Circle {

	private int r;
	
	public Circle(int r) {
		this.r=r;
	}
	
	public double getSize() {
		return r*r*3.14;
	}

	@Override
	public String toString() {
		return "������ "+r+"�� ���� ���̴� "+getSize()+"�Դϴ�";
	}
	
	
}

public class CircleEx {

	public static void main(String[] args) {
         Circle ob=new Circle(10);
         System.out.println("���� ����: "+ob.getSize());
         System.out.println(ob.toString());
		
		
		
	}

}
