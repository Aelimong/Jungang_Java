package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * 리스트에러 : 컴파일러에는 이상 없으나 실행시에 형변환 문제 발생
 * 
 */

public class ListError {
	 @SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
      List<Object> list=new ArrayList<>(); 
      list.add("봄");
      list.add("여름");
      list.add("가을");
      list.add(new Integer(4));
      list.add("겨울");
      list.add(5.0f);
      list.add(4.0);
      
      
    //  System.out.println(list);
      
      for(int i=0; i<list.size(); i++) {
    	//  String season=(String) list.get(i);  //Integer cannot be cast to java.lang.String
    	                                          //리스트 배열중 String으로 형변환을 할 수 없는 것이 있다(정수,Integer)
    	  Object season=list.get(i);
    	  System.out.println(season);
      }
      
	}

}
