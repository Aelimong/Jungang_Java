package collection2;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {

	public static void main(String[] args) {
		  Map<String, Integer> map=new HashMap<>();
		  map.put("�ظ�����", Integer.valueOf(95));
		  map.put("��", Integer.valueOf(75));
		  map.put("�츣�̿´�", Integer.valueOf(85));
		  map.put("������", Integer.valueOf(88));
		  map.put("����", Integer.valueOf(93));
		  map.put("�ظ�����", Integer.valueOf(85));  ///�ߺ��� ��� �ȵǴϱ� �̰ɷ� �տ� �ظ����Ͱ� ����
		  map.put("null", Integer.valueOf(95));    //key�� �� ���
		  map.put("�����Ʈ", null);                 //���� �� ���

		  
		  System.out.println(map); //����ϸ� ���� ���� ����
		  
		  Integer num=map.get("������"); //Ű���� �������� ���� ���Խ�Ű�� ��@@!! �׷��� �ڷ����� Ű���� ��ġ �ؾ���!
		  System.out.println("������ ������? "+num);
	
//		   int n=num.intValue();    ��ڽ�!!
		   int n=new Integer(num); //�����ڽ�
           System.out.println(n);
	
	
	} 

}
