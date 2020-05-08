package shape;

public class ShapeMain {

	public static void main(String[] args) {
      //정적바인딩  
		Rectangle ob1=new Rectangle(4,5);
		System.out.println("사각형의 넓이 : "+ob1.getSize());
	
	
	   Triangle ob2=new Triangle(3,7);
	   System.out.println("삼각형의 넓이 : "+ob2.getSize());
	

	  //동적바인딩
		
		Shape sh=null;
		
		sh=new Rectangle(4,5);
		System.out.println("사각형의 넓이 : "+sh.getSize());
		
		sh=new Triangle(4,5);
		System.out.println("사각형의 넓이 : "+sh.getSize());
		
		
		
		
	}
	
	
	

}
