package col;
import java.util.*;



public class LinkedListEx {

	public static void main(String[] args) {
		//���� ���۹���� ���� �ٸ�.. ArrayList�� ���� ����� �Ȱ�����
		LinkedList<StudentData> list=
				new LinkedList<StudentData>();
		StudentData st1=new StudentData("����",10,100);
		
		list.add(st1);
		list.add(new StudentData("Ʈ��1",20,70));
		list.add(new StudentData("Ʈ��2",20,70));
		list.add(new StudentData("Ʈ��3",20,70));
		list.add(new StudentData("Ʈ��4",20,70));
		list.add(new StudentData("Ʈ��5",20,70));
		list.add(new StudentData("Ʈ��6",20,70));
		
		list.add(3,new StudentData("Ʈ��7",20,70));
		list.remove(5);//����� �Ȱ����� ��ũ�� �ٲٴ� �� 
		list.remove(st1); //�����Ǵ� ������ �갡 �� ����,,, ������ ã�Ƴ������ �ð��� �ɸ�....
		StudentData t = list.get(4);//��ũ�帮��Ʈ�� �ִ� ����...
		
		/*�߸��� ����
		for(int i=0; i<list.size(); i++) {
			StudentData ref = list.get(i);
			System.out.println(ref.name);
		}  //LinkedList������ �̷��� ��� ������� 
		   //�� �� ���������� ó������ �ϳ��� �� �Ȱ��		
		*/
		
		
		/*������ ����....�ƹ��� �̷��� �� ��
		  �ݺ��ڿ���!! 
		  ���ο� ������ �������� �޶� �ݺ��ؾ��� ������ �ٸ���
		  �÷��� ���ͷ����͸� ���� �������Ѵ�.
		Iterator<StudentData> iter = list.iterator();
	
		      //�������� �־�???? ��� ������ �ɾ��ִ� ��
		while(iter.hasNext()) {
			StudentData ref = iter.next();
			System.out.println(ref.name);
		}*/
		
		      //list���� �̾Ƽ� StudentData���� �ϳ��� �̾Ƽ� ref�� �ְڴ�
			  //�ݺ��ڰ� ����Ǿ��ִ� ���(�ڷᱸ��)���� ���� for�� ��밡��)
		for(StudentData data :list) {
			System.out.println(data.name);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
