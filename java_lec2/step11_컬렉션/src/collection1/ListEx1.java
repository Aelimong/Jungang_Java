package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*List :서로 다른 자료형의 연속된 기억공간; 속도가 조금 느리긴 하지만 추가추가추가 가능함
         중복 가능함, 순서유지O, 동일한 자료형이 들어와도 상관없음!
         List 유틸 임포트 해야함! 컨트롤 스페이스바
*/

public class ListEx1 {
	 @SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
      List<Object> list=new ArrayList<>(); //Object는 모든 클래스의 최상위에 존재, 뭐든 들어갈 수 있음
      list.add("봄");
      list.add("여름");
      list.add("가을");
      list.add(new Integer(4));
      list.add("겨울");
      list.add(5.0f);
      list.add(4.0);
      
      
    //  System.out.println(list);
      
      for(Object ob : list) {
    	  System.out.println(ob);
      }
      
      
      Iterator iter=list.iterator();
      while(iter.hasNext())
    	  System.out.println(iter.next());
      
	}

}
