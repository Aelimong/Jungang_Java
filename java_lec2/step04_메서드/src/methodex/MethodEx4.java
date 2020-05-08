package methodex;
/*--출력
 * 총점 : 253점
 * 평균 : 84.33점
 * 학점 : B
 * 결과 : 합격
 * -------------
 * 학점 : switch문 이용
 * 결과 if~else f면 불합격 아니면 합격 을 리턴
 * 
 * */

public class MethodEx4 {

	
/*
     public static int total(int k, int e, int m) {
	      return k+e+m;  //리턴하고 싶은 값이 정수면 int 써야함
	                     //리턴은 호출한 곳으로 되돌아감 (값을 가지고)
      }

     public static double avg(int tot) {
    	 double av=tot/3.0;
    	 return av;
     }
     
     public static char grade(double av){
	     
    	 char gr;
    	 int AV=(int)av;
    	 
    	 switch(AV/10) {
	     case 10: 
	     case 9 : gr='A'; break;
	     case 8 : gr='B'; break;
	     case 7: gr='C'; break;
	     case 6: gr='D'; break;
	     default: gr='F';
	     }
	     return gr;
    	 
     }
	     
     public static String result(char gr){
	    
    	 String rs;
    	 
    	 if(gr == 'F') {
    		 rs="불합격";
    	 } else 
    		 {
    		 rs="합격";
    		 }
    	 return rs;
    	 
     }
	
	public static void main(String[] args) {
	
	*/
	
    public static int total(int k, int e, int m) {
	      return k+e+m;  
	      }

   public static double avg(int tot) {
  	return tot/3.0;
  	
   }
   
   public static char grade(double av){
	     
  	 char gr;
  	 switch((int)av/10) {
	     case 10: 
	     case 9 : gr='A'; break;
	     case 8 : gr='B'; break;
	     case 7: gr='C'; break;
	     case 6: gr='D'; break;
	     default: gr='F';
	     }
	     return gr;
  	 
   }
	     
   public static String result(char gr){
	     	 
  	 if(gr == 'F') {
  		return "불합격";
  	 } else  {
  		 return"합격";
  		 }
   }
	
	public static void main(String[] args) {
		
		int k=95, e=85, m=73;  //메모리상의 임시값
		
		System.out.println("총점 : "+total(k, e, m)); 
		System.out.printf("평균 : %.2f\n", avg(total(k, e, m)));
		System.out.println("학점 : "+grade(avg(total(k, e, m))));
        System.out.println("결과: "+result(grade(avg(total(k, e, m)))));
		
	

	}

}
