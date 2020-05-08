package family;


/*
 * 이름: 홍길동
 * 아빠는 나가서 일을 한다
 * 
 * 이름 : 소정
 * 엄마는 집안일을 한다
 * 
 * 이름 : 홍준표
 * 아들은 공부한다
 * 
 */
public class MainEx {

	public static void main(String[] args) {
	
		
		Father fa=new Father("홍길동");
		System.out.println(fa.toString());
		
		Mother mo=new Mother("소정");
		System.out.println(mo.toString());
		
		Son so=new Son("홍준표");
		System.out.println(so.toString());
		
		
        /*
		
		1. 객체배열

     Family[] fm= new Family[3]; 
     fm[0] = new Father("홍길동");
     fm[1] = new Mother("소정");
     fm[2] = new Son("홍준표");
  
      
     for(int i=0; i<fm.length; i++) {
   	  System.out.println(fm[i].toString());
      }
    	  
		
		
		2.향상된 포문
    	  Family [] f1= new Family[] {
    			  new Father("홍길동"),
                  new Mother("소청"),
                  new Son("홍준표")};
 
    	  
    	  for(Family ob : f1) {
           	  System.out.println(ob);
        	  }
    	  
    	  */
        	  
    	  
    	  
    	  
    	  
}
}