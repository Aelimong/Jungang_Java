package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set :중복 허용 X, 순서 유지X
//꼭 컨트롤 스페이스바로 불러오기
public class SetEx {
   @SuppressWarnings(value="unchecked") //type을 확인하지 않음 ,자료형 검사를 하지 않는다는 의미로 사용
   
	
	public static void main(String[] args) {
      Set set = new HashSet();  // Set<자료형> ---> <자료형>만 인식 
      set.add("one");  //add(Object)
	  set.add(2);      //int  --> new Integer(2) :기본형(참조자료형만 올 수 있음!!!)-->객체형(Boxing)
	  set.add(new Float(3.0f));
	  set.add(4.00);    //double --> new Double(4.00)
	  set.add(2);
	  set.add(new Integer(2));
	  set.add(new Double(4.00));
  //  set.add(Integer.valueOf(2));
	  
	  Iterator iter=set.iterator(); //set클래스에서 사용가능한 인터페이스
	  while(iter.hasNext()) ///다음에 출력해줄 수 있는 값이 있는가??
	    System.out.println(iter.next());
	}

}
