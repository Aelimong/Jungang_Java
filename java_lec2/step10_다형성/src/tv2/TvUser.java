package tv2;
//결합도가 낮은 코드, 다형성 이용
public class TvUser {

	public static void main(String[] args) {
          String com=args[0];
          
          Tv tv=null;
          if(com.equals("lg")||com.equals("LG")) {  //com=="LG" 컴이 엘지인가?
        	 tv=new LgTv();
          }else if(com.equals("SAMSUNG")) {
        	 tv=new SamsungTv();
          }else {
        	  System.out.println("error");
          }
          tv.powerOn();
          tv.soundUp();
    	  tv.soundDown();
    	  tv.powerOff();
		
	}

}
