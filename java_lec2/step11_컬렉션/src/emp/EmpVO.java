package emp;

/*
 * VO(value object), entity, DTO(data transfer object), bean
 *      :�����͸� �ϳ��� ��� ������ �������� ���� Ŭ����
 *      :������ ����� ������ �� �ֵ��� �޼������ �������� Ŭ����
 *      :���α׷� ���� �� ������ ����� �����ؾ���
 */
//           --Ŭ���� �ڷ���!!!!
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
