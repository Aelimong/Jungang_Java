package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*List :���� �ٸ� �ڷ����� ���ӵ� ������; �ӵ��� ���� ������ ������ �߰��߰��߰� ������
         �ߺ� ������, ��������O, ������ �ڷ����� ���͵� �������!
         List ��ƿ ����Ʈ �ؾ���! ��Ʈ�� �����̽���
*/

public class ListEx1 {
	 @SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
      List<Object> list=new ArrayList<>(); //Object�� ��� Ŭ������ �ֻ����� ����, ���� �� �� ����
      list.add("��");
      list.add("����");
      list.add("����");
      list.add(new Integer(4));
      list.add("�ܿ�");
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
