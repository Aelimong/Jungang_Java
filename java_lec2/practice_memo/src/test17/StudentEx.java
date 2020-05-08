package test17;
/*
(3)클래스명 : StudentEx
Student ob=new Student();
ob.setStudent("이순신",75,80,90);
System.out.println(ob.getView());


(4)출력화면
나의 이름은 이순신이고 총점은 245점이고 
평균은 81.666666이고 학점은 B학점이며 
결과는 합격입니다

 */
public class StudentEx {

	public static void main(String[] args) {
        Student ob=new Student();
        ob.setStudent("이순신",75,80,90);
         System.out.println(ob.getView());
	
		
	}

}
