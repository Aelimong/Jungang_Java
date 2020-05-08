package test21;

/*
(3)클래스명 : EmpEx
Emp em=new Emp();
em.setName("강호동");
em.setDept("영업부");
em.setSalary(1200000);
System.out.println(em.toString());

System.out.println("이름 : " + em.getName());
System.out.println("부서 : " + em.getDept());
System.out.println("급여 : " + em.getSalary() + "원");

4)출력화면
강호동은 영업부사원이며 1520000원의 급여를 받습니다

이름 : 강호동
부서 : 영업부
급여 : 1200000원

 */


public class EmpEx {

	public static void main(String[] args) {
       Emp em=new Emp();
       em.setName("강호동");
       em.setDept("영업부");
       em.setSalary(1200000);
       
       System.out.println(em.toString());
		
       System.out.println("이름 : "+em.getName());
       System.out.println("부서 : "+em.getDept());
       System.out.println("이름 : "+em.getSalary()+"원");
       
		
		
		
	}

}
