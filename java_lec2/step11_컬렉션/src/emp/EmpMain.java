package emp;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		System.out.println("***��� ��� ����ϱ�***");

		List<EmpVO> list = dao.getEmpList(); // List<EmpVO> list���⿡ �����ؼ� ����ؾ��Ѵ�.
		for (EmpVO ob : list) {
			System.out.print("�̸� : " + ob.getEname() + "\t");
			System.out.print("�μ� : " + ob.getDept() + "\t");
		}

		// ---------------------------------------------------

		System.out.println("****lee ��� ����ϱ�****");
		EmpVO vo = dao.getEmp("lee");

		if (vo == null) {
			System.out.println("ã�� ����� �����...");
		} else {
			System.out.println(vo.getEname() + " " + vo.getDept() + " " + vo.getSalary());

		}

	}

}
