package collection2;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {

	public static void main(String[] args) {
		  Map<String, Integer> map=new HashMap<>();
		  map.put("해리포터", Integer.valueOf(95));
		  map.put("론", Integer.valueOf(75));
		  map.put("헤르미온느", Integer.valueOf(85));
		  map.put("말포이", Integer.valueOf(88));
		  map.put("지니", Integer.valueOf(93));
		  map.put("해리포터", Integer.valueOf(85));  ///중복이 허용 안되니까 이걸로 앞에 해리포터가 덮임
		  map.put("null", Integer.valueOf(95));    //key에 널 허용
		  map.put("볼드모트", null);                 //값에 널 허용

		  
		  System.out.println(map); //출력하면 순서 없이 나옴
		  
		  Integer num=map.get("말포이"); //키값을 기준으로 값을 대입시키는 것@@!! 그래서 자료형은 키값과 일치 해야함!
		  System.out.println("말포이 성적은? "+num);
	
//		   int n=num.intValue();    언박싱!!
		   int n=new Integer(num); //오토언박싱
           System.out.println(n);
	
	
	} 

}
