package test15;

/*
 * 
(1)Å¬·¡½º¸í:Triangle   --main()Æ÷ÇÔ X

-base:double
-height:double
+setData(base:int, height:int):void
+getSize():double
+getView():String

 */


public class Triangle {

	private double base;
	private double height;
	
	public void setData(int base, int height) {
		
		this.base=base;
		this.height=height;
	}

	
	public double getSize() {
	return (base*height)/2.0;
	}
	
	
	public String getView() {
		return "»ï°¢ÇüÀÇ ³ĞÀÌ : "+getSize();
	}
	

	//»ï°¢ÇüÀÇ³ĞÀÌ : 10.50
	
	
}
