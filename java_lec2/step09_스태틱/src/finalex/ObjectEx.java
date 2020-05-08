package finalex;
import java.lang.Object;  //자바는 항상 여기에 상속 되어있음(생략 되어있음)
import java.lang.String; 
import java.lang.System;

class Test{
    String name="강호동";
    
   
//
//    public Test() { //생성자! 생략가능함
//	} 
    
    
    public void view() {
    	System.out.println("이름 : "+this.name.toString());
    }
    
}


public class ObjectEx {

	public static void main(String[] args) {
      Test ob=new Test();
      ob.view();
	}

}
