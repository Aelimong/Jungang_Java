package shape;

public class ShapeMain {

	public static void main(String[] args) {
      //�������ε�  
		Rectangle ob1=new Rectangle(4,5);
		System.out.println("�簢���� ���� : "+ob1.getSize());
	
	
	   Triangle ob2=new Triangle(3,7);
	   System.out.println("�ﰢ���� ���� : "+ob2.getSize());
	

	  //�������ε�
		
		Shape sh=null;
		
		sh=new Rectangle(4,5);
		System.out.println("�簢���� ���� : "+sh.getSize());
		
		sh=new Triangle(4,5);
		System.out.println("�簢���� ���� : "+sh.getSize());
		
		
		
		
	}
	
	
	

}
