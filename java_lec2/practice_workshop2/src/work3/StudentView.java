package work3;

import java.util.ArrayList;
import java.util.List;

public class StudentView extends Student{


	public void viewStudent(Student s1) {
		System.out.println(s1.getName()+"\t"+s1.getAge()+"\t"+s1.getHeight()+"\t"+s1.getWeight()+"\n");
	}

	public void viewStudentList(ArrayList<Student> list) {
		
		for(Student s : list) {
			System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getHeight()+"\t"+s.getWeight());
		}
		
	}


	

}
	
	
	
	
	
