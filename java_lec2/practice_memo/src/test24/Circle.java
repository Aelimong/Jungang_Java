package test24;
/*
-r:int
+Circle()
+Circle(r:int)
+setter & getter
+getCalc():double 
+toString():String    ==>  반지름 : 10  /   반지름 : 5 출력
 */
public class Circle {
	
   private int r;
   
   public Circle() {
	// TODO Auto-generated constructor stub
}

   public Circle(int r) {
	super();
	this.r = r;
}

   public int getR() {
	return r;
}

    public void setR(int r) {
	this.r = r;
}

   
    public double getCalc() {
	  return 0; 
  }
  

@Override
public String toString() {
	return "반지름 : "+getR();
}
  
  
  
  

}
