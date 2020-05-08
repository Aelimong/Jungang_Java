package test20;
/*
(1)package명은 test20로 하고 CircleEx.java파일을 하나 만들어서 
클래스를 2개 추가하시오

(2)클래스명 : Circle
-r:int

+Circle(r:int)
+getSize():double

(3) 클래스명 : CircleEx
Circle ob=new Circle(10);
System.out.println("원의넓이 : " + ob.getSize());

(3)출력화면
반지름 10인 원의 넓이는 314.16입니다
 
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
		return "반지름 "+r+"인 원의 넓이는 "+getSize()+"입니다";
	}
	
	
}

public class CircleEx {

	public static void main(String[] args) {
         Circle ob=new Circle(10);
         System.out.println("원의 넓이: "+ob.getSize());
         System.out.println(ob.toString());
		
		
		
	}

}
