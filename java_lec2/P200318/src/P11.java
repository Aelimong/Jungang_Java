/*Ŭ���� �޸�
1. �޸��� ���¸� �����ϴ� ��
�����͸� ���� ������ ���� �켱����
*/
class Student{ //1.�̷��̷��� �����͸� �ϳ��� ���ھ�� , ���Ǹ� �ϴ� ��, �޼ҵ� �� ���� ���๮
	String name;
	String score;
	String age;
	
	
}

public class P11 {

	public static void main(String[] args) {
		Student[] studentList = new Student[10];
		//studentList[0]=new Student();
		
		for(int i=0; i<studentList.length; i++) {
			studentList[i]=new Student();
		}
		
		studentList[0].name="Ʈ���̼�";
		studentList[0].score="70";
		studentList[0].age="20";
		
		System.out.println(studentList[0].name);
		
		
		
		
		
		
		
		/*
		Student st1 = new Student(); //���޸𸮿� �� Ŭ���� ������ �޸𸮸� �����ϰڴ�
		st1.name="Ʈ���̼�";
		st1.score="70";
		st1.age="20";
		
		st1= new Student();
		System.out.println(st1.name);  //���ο� �޸𸮰� ���� �Ǵ� �Ŷ� ���� null


		String[][] datas=new String[10][3];
		datas[0][0]="Ʈ���̼�";
		datas[0][1]="20";
		datas[0][2]="99";

		datas[1][0]="����";
		datas[1][1]="30";
		datas[1][2]="70";
		//���������� ������ ������(���� �� �ִ�)
	*/
	}

}
