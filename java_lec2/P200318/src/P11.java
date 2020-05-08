/*클래스 메모리
1. 메모리의 형태를 정의하는 것
데이터를 묶는 과정이 제일 우선순위
*/
class Student{ //1.이러이러한 데이터를 하나로 묶겠어요 , 정의만 하는 것, 메소드 안 쪽이 실행문
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
		
		studentList[0].name="트레이서";
		studentList[0].score="70";
		studentList[0].age="20";
		
		System.out.println(studentList[0].name);
		
		
		
		
		
		
		
		/*
		Student st1 = new Student(); //힙메모리에 이 클래스 형태의 메모리를 생성하겠다
		st1.name="트레이서";
		st1.score="70";
		st1.age="20";
		
		st1= new Student();
		System.out.println(st1.name);  //새로운 메모리가 생성 되는 거라 값이 null


		String[][] datas=new String[10][3];
		datas[0][0]="트레이서";
		datas[0][1]="20";
		datas[0][2]="99";

		datas[1][0]="한조";
		datas[1][1]="30";
		datas[1][2]="70";
		//문법적으로 가능은 하지만(꼬일 수 있다)
	*/
	}

}
