package emp;

/*
 * VO(value object), entity, DTO(data transfer object), bean
 *      :데이터를 하나로 묶어서 전송할 목적으로 만든 클래스
 *      :변수를 만들고 접근할 수 있도록 메서드들을 만들어놓은 클래스
 *      :프로그램 만들 때 무조건 만들고 시작해야함
 */
//           --클래스 자료형!!!!
public class EmpVO {
private String ename;
private String dept;
private int salary;

public EmpVO() {
	// TODO Auto-generated constructor stub
}

public EmpVO(String ename, String dept, int salary) {
	super();
	this.ename = ename;
	this.dept = dept;
	this.salary = salary;
}

public String getEname() {
	return ename;
}

public String getDept() {
	return dept;
}

public int getSalary() {
	return salary;
}

public void setEname(String ename) {
	this.ename = ename;
}

public void setDept(String dept) {
	this.dept = dept;
}

public void setSalary(int salary) {
	this.salary = salary;
}

	
	
}
