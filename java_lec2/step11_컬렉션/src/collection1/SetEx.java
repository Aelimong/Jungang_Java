package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set :�ߺ� ��� X, ���� ����X
//�� ��Ʈ�� �����̽��ٷ� �ҷ�����
public class SetEx {
   @SuppressWarnings(value="unchecked") //type�� Ȯ������ ���� ,�ڷ��� �˻縦 ���� �ʴ´ٴ� �ǹ̷� ���
   
	
	public static void main(String[] args) {
      Set set = new HashSet();  // Set<�ڷ���> ---> <�ڷ���>�� �ν� 
      set.add("one");  //add(Object)
	  set.add(2);      //int  --> new Integer(2) :�⺻��(�����ڷ����� �� �� ����!!!)-->��ü��(Boxing)
	  set.add(new Float(3.0f));
	  set.add(4.00);    //double --> new Double(4.00)
	  set.add(2);
	  set.add(new Integer(2));
	  set.add(new Double(4.00));
  //  set.add(Integer.valueOf(2));
	  
	  Iterator iter=set.iterator(); //setŬ�������� ��밡���� �������̽�
	  while(iter.hasNext()) ///������ ������� �� �ִ� ���� �ִ°�??
	    System.out.println(iter.next());
	}

}
