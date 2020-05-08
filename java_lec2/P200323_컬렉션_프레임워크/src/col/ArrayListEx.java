package col;
import java.util.*; //�÷��� �����ӿ�ũ ����� ���ؼ�


class StudentData implements Comparable<StudentData>{
	String name;
	int age;
	int score;
	
	StudentData(String name, int age, int score){
		this.name=name;
		this.age=age;
		this.score=score;
		
	}

	@Override
	public int compareTo(StudentData o) {
		//������ ũ���۳İ� ���� ������ �����ڴ�
		//set�迭 �� �� ���⼭ ������������Ѵ�!!
		
		if(this.score==o.score) {
			return 0;	
		}else if(this.score>o.score) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
}


public class ArrayListEx {

	public static void main(String[] args) {

		//StudentData[] arr= new StudentData[100]; 
		//�� �迭�� ������ ���������� ��, �迭 ���� �� ���� ���� ex)��Ʈ��
		
		ArrayList<StudentData>  list=
				new ArrayList<StudentData>(100); 
		//���ΰ� �迭�̰� 10���� ũ�⸦ ���� �迭�� �ڵ����� ����
		//(100)��ȣ �ȿ� ���� ������ �׸�ŭ�� ũ�⸦ ���� �迭 ����
		StudentData st1=new StudentData("����",10,70);
		
		list.add(st1);
		        //StudentDataŸ���� ���� �ֱ�!
		
		list.add(new StudentData("Ʈ��",20,100));
		list.add(new StudentData("Ʈ��2",20,100));
		list.add(new StudentData("Ʈ��3",20,100));
		list.add(new StudentData("Ʈ��4",20,100));
		list.add(new StudentData("Ʈ��5",20,100));
		list.add(new StudentData("Ʈ��6",20,100));
		
		
		list.add(3, new StudentData("Ʈ��7",20,100));
		//arrayList���� �̷��� �߰��� �о�ִ� �� �����ؾ��Ѵ�!
		list.remove(5);
		//�߰��� �����ϰ� �ڿ� �κ��� ������ �о�ִ� �Ŷ� �����ؾ��Ѵ�!
		//�����ս������� ���� �ɸ�
		list.remove(st1);//�����ε� ���� �� ����, �ε����Ӹ� �ƴ϶�
		
		StudentData t=list.get(3);// arrayList�� ���� ū ����! 
		                          //�ε����� ������ ���� �̾Ƴ� �� �ִ�!
		
		 for(int i=0; i<list.size(); i++) {
			 StudentData ref=list.get(i);
			 System.out.println(ref.name);
		 }
		
		
		
		
	}

}
