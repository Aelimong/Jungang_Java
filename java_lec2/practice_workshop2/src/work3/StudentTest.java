package work3;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {

		System.out.println("이름      " + "나이       " + "신장        " + "몸무게      ");
		System.out.println("---------------------------------");

		Student s1 = new Student("민들래", 15, 170, 55);
		Student s2 = new Student("진달래", 22, 165, 53);
		Student s3 = new Student("개나리", 20, 155, 46);

		
		
		
		StudentView ob1 = new StudentView();
		ob1.viewStudent(s1);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		StudentView ob2 = new StudentView();
		ob2.viewStudentList(list);

	}

}
