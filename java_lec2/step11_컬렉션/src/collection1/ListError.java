package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * ����Ʈ���� : �����Ϸ����� �̻� ������ ����ÿ� ����ȯ ���� �߻�
 * 
 */

public class ListError {
	 @SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
      List<Object> list=new ArrayList<>(); 
      list.add("��");
      list.add("����");
      list.add("����");
      list.add(new Integer(4));
      list.add("�ܿ�");
      list.add(5.0f);
      list.add(4.0);
      
      
    //  System.out.println(list);
      
      for(int i=0; i<list.size(); i++) {
    	//  String season=(String) list.get(i);  //Integer cannot be cast to java.lang.String
    	                                          //����Ʈ �迭�� String���� ����ȯ�� �� �� ���� ���� �ִ�(����,Integer)
    	  Object season=list.get(i);
    	  System.out.println(season);
      }
      
	}

}
