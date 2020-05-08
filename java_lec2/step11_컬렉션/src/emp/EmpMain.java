package emp;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		System.out.println("***모든 사원 출력하기***");

		List<EmpVO> list = dao.getEmpList(); // List<EmpVO> list여기에 대입해서 사용해야한다.
		for (EmpVO ob : list) {
			System.out.print("이름 : " + ob.getEname() + "\t");
			System.out.print("부서 : " + ob.getDept() + "\t");
		}

		// ---------------------------------------------------

		System.out.println("****lee 사원 출력하기****");
		EmpVO vo = dao.getEmp("lee");

		if (vo == null) {
			System.out.println("찾는 사원이 없어요...");
		} else {
			System.out.println(vo.getEname() + " " + vo.getDept() + " " + vo.getSalary());

		}

	}

}
