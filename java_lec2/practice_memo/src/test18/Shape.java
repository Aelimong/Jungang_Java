package test18;
/*
+Shape(x:int)  --> 원의넓이를 구해서 출력(원의넓이=반지름*반지름*3.14)
+Shape(x:int, y:int)  --> 사각형의 넓이를 구해서 출력(사각형의넓이=가로*세로)
+Shape(x:int, y:int, z:int)
 --> 사다리꼴의 넓이를 구해서 출력(사다리꼴의 넓이=(밑변 + 윗변 )*높이/2)
 */
public class Shape {
	
//	int x,y,z;
	
	
	public Shape(int x) {
//	     this.x=x;
	     System.out.println("원의 넓이 : "+(double)(x*x*3.14));		
	}
	
	public Shape(int x, int y) {
//		this.x=x;
//		this.y=y;
		System.out.println("사각형의 넓이 : "+(double)(x*y));		
	}
	
    public Shape(int x, int y, int z) {
//    	this.x=x;
//      this.y=y;
//      this.z=z;
        System.out.println("사다리꼴의 넓이 : "+(double)((x+y)*z/2.0));
	}
	
 
	
	

}
