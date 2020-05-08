package tv1;
//결합도가 높은 코드
public class TvUser {

	public static void main(String[] args) {
          String com=args[0];
          
          if(com.equals("LG")) {  //com=="LG" 컴이 엘지인가?
        	  LgTv tv=new LgTv();
        	  tv.powerOn();
        	  tv.volumerUp();
        	  tv.volumeDown();
        	  tv.powerOff();
        	  
          }else if(com.equals("SAMSUNG")) {
        	  SamsungTv tv=new SamsungTv();
        	  tv.turnOn();
        	  tv.soundUp();
        	  tv.soundDown();
        	  tv.turnOff();
        	  
          }else {
        	  System.out.println("error");
          }
		
		
	}

}
