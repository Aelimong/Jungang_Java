package methodex;

public class MethodEx5 {

	public static void show1() {   //call by name 
		System.out.println("안녕하세여");
		// return; void가 있으면 생략 가능 
	}
	
                               //실 매개변수
	public static void show2(char c, int i) {  //call by value
	System.out.println("타입 : "+c);
	System.out.println("코드: "+i);
	}
	
	public static String show3() {
		return "hello";
	}
	
	public static float show4(int a,int b, int c) {
		return (a+b+c)/3.0f;
	}
	
	
	
	public static void main(String[] args) {
		show1();
		show2('A', 25); //형식 매개변수
		String s=show3();
		System.out.println("리턴값 : "+s);
		
		float k=show4(15, 45, 73);
        System.out.printf("리턴값 : %.2f\n", k);		
		
        
        
        
        
        
	}





}
