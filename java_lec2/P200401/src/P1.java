import java.util.*;

public class P1 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>(); //List�� �������̽��� new List(); ��ü���� �Ұ�
		
		list.add(null);
		list.add("������");
		list.add(2,"�Ѻ�");
		list.add(3,"����");
		list.add(3,"��");
		list.add(4,"��");
		list.add(5,"û�ұ�");
		
		String str=list.get(3);
		
		System.out.print(str+"\n");
		System.out.println();
		
		list.remove(2);
		
		
		System.out.println();
		System.out.println("����Ʈ ������"+list.size());
		System.out.println();
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + list.get(i));
		}
		
		
		
		
	}

}
