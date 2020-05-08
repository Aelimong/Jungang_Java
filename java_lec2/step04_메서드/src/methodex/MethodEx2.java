package methodex;

public class MethodEx2 {
   public static int view1() { //2
	  return 10; //3
    }

   public static char view2() {
	   return 'A'; // A를 만나면 다시 메인함수로 넘어옴
   }
 
   public static float view3() {
	   return 50.3f;
   }
   
   public static String view4() {
	   return "Hello";
   }
   
   public static double view5() {
	   return 100.4;
   }
   
   public static boolean view6() {
	             //true 아니면 false
	   return false;
   }
   
   
   
   
	public static void main(String[] args) {
        int a=view1(); System.out.println(a);
          //4   //1            //5   
		char b=view2(); System.out.println(b);
		float c=view3(); System.out.println(c);
		
		System.out.println(view3());
		System.out.println(view4());
		System.out.println(view5());
		System.out.println(view6());
		  
		
		
		
	}

}
