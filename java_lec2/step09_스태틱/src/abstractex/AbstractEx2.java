package abstractex;

abstract class Shape{
	abstract public void onDraw();
	abstract public void onDelete();
}

//---------------------------------------------

class Rectangle extends Shape{

	@Override
	public void onDraw() {
		System.out.println("�簢���� �׸���");
	}

	@Override
	public void onDelete() {
		System.out.println("�簢���� �����");
	}
	
}

//--------------------------------------
class Circle extends Shape{

	@Override
	public void onDraw() {
		System.out.println("���� �׸���");
	}

	@Override
	public void onDelete() {
		System.out.println("���� �����");
	}
	
}

public class AbstractEx2 {

	public static void main(String[] args) {
		
		//�������ε�
		Rectangle rt=new Rectangle();
		rt.onDraw();
		rt.onDelete();
		
		Circle cc=new Circle();
		cc.onDraw();
		cc.onDelete();
			
		//�������ε�
		Shape ob=null;
		
		ob=new Rectangle();
		ob.onDraw();
		ob.onDelete();
		
		ob=new Circle();
		ob.onDraw();
		ob.onDelete();
		
		

	}

}
