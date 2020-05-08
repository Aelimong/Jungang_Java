package methodex;

//call by value 복사에 의한 전달

public class MethodEx3 {
     public static void show1(int a, char b, double c, float d) {
    	 System.out.println(a+" "+b+" "+c+" "+d);
     }
	
	 public static int show2(int a, int b, int c) {
		 return a+b+c;
	 }
	
	 public static double show3(int a, int b, int c) {
		 return (a+b+c)/3.0;
	 }
	
	 public static String show4(int a, int b, int c) {
		 
		       double avg=(a+b+c)/3.0;  //평균계산
		       String rs;
				 if(avg>=60) { 
					 rs="합격";
				 } else rs="불합격";
					return rs;
      }
	
	public static void main(String[] args) {

		show1(10, 'A', 100.4, 50.3f);
		int sum=show2(95,85,73);
	 System.out.println("합계 : "+sum);
	 
	 
	 double avg=show3(95,85,73);
	 System.out.printf("평균 : %.1f점\n", avg);
	 
	 String result=show4(95,85,73);
	
	 System.out.println("결과 : "+result);
	 
	 
	 
	 
	}

}
