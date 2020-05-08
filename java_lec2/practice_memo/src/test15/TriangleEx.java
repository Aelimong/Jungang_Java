package test15;


/*
 * 
(2)클래스명:TriangleEx   --main()포함 O

Triangle ob=new Triangle();
ob.setData(3,7);
System.out.println(ob.getView());

(3) 삼각형의 넓이 = (밑변 * 높이) /2 공식을 이용하고 
     getSize()에서 계산하고 출력은 getView()에서 하시오

(4) 출력화면
삼각형의넓이 : 10.50

 */

public class TriangleEx {

	public static void main(String[] args) {
      Triangle ob=new Triangle();
      ob.setData(3,7);
      System.out.println(ob.getView());	
		
	}

}
