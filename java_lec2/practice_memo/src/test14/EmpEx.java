package test14;
/*
  
(3) 파일명 : EmpEx   --main()포함 O
Emp ob=new Emp();
ob.setEmp("이순신", 25, 175.3);
ob.viewEmp();

(4) 출력화면
나의 이름은 이순신이며, 25살이고 키는 175.3cm입니다
 
 */
public class EmpEx {

	public static void main(String[] args) {
    Emp ob=new Emp();
    ob.setEmp("이순신", 25, 175.3);
    ob.viewEmp();
   // System.out.println(ob.hashCode());
	}

}
